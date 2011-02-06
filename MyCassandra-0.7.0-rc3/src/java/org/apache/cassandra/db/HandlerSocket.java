package org.apache.cassandra.db;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;


public class HandlerSocket {
	private static final byte TOKEN_SEPARATOR = 0x09;
	private static final byte COMMAND_TERMINATE = 0x0a;

	private static final int SOCKET_TIMEOUT = 30 * 1000;
	private static final int SOCKET_BUFFER_SIZE = 8 * 1024;
	private static final int EXECUTE_BUFFER_SIZE = 8 * 1024;
	
	private int timeout = SOCKET_TIMEOUT;
	private int sendBufferSize = SOCKET_BUFFER_SIZE;
	private int receiveBufferSize = SOCKET_BUFFER_SIZE;
	private int executeBufferSize = EXECUTE_BUFFER_SIZE;
	private boolean isBlocking = false;
	private boolean tcpNoDelay = true;

	SocketChannel socket;
	Selector selector;
	BlockingQueue<byte[]> commandBuffer;
	Command command;
	int currentResultSize = 0;
	
	public HandlerSocket(){
		super();
		commandBuffer = new LinkedBlockingQueue<byte[]>();
		command = new Command();
	}
	
	public void clear(){
		this.commandBuffer.clear();
		this.currentResultSize = 0;
	}
	
	public Command command(){
		return command;
	}
	
	public int getCommandSize(){
		int total = 0;
		for(byte[] b : commandBuffer){
			total += b.length;
		}
		
		return total;
	}
	
	public int getCurrentResponseSize(){
		return currentResultSize;
	}
	
	public void open(String host, int port) throws IOException{
		open(InetAddress.getByName(host), port);
	}
	
	public void open(InetAddress address, int port) throws IOException{
		if(socket != null && socket.isConnected()){
			close();
		}
		
		selector = Selector.open();
		socket = SocketChannel.open();
		socket.configureBlocking(isBlocking);
		socket.socket().setReceiveBufferSize(receiveBufferSize);
		socket.socket().setSendBufferSize(sendBufferSize);
		socket.socket().setSoTimeout(timeout);
		socket.socket().setTcpNoDelay(tcpNoDelay);

		socket.connect(new InetSocketAddress(address, port));
		while(!socket.finishConnect()){}
	}
	
	public synchronized List<HandlerSocketResult> execute() throws IOException{
		if(commandBuffer.size() == 0)
			return null;
		currentResultSize = 0;

		socket.register(selector, socket.validOps());
		List<HandlerSocketResult> results = new ArrayList<HandlerSocketResult>();
		try{
			boolean processComplete = false;
			while(!processComplete && selector.select() > 0){
				Iterator iterator = selector.selectedKeys().iterator();
				while(iterator.hasNext()){
					SelectionKey key = (SelectionKey)iterator.next();
					iterator.remove();
					
					if(key.isWritable()){
						SocketChannel channel = (SocketChannel)key.channel();
						final ByteArrayOutputStream buf = new ByteArrayOutputStream();
						for(byte[] command ; (command = commandBuffer.poll()) != null ; ){
							buf.write(command);
						}
						channel.register(selector, SelectionKey.OP_READ);

						ByteBuffer wb = ByteBuffer.wrap(buf.toByteArray());
						while(wb.remaining()>0){
							channel.write(wb);
						}
					}else if(key.isReadable()){
						ByteArrayOutputStream buffer = new ByteArrayOutputStream();
						int readSize = 0;
						
						ByteBuffer rb = ByteBuffer.allocate(executeBufferSize);
						rb.clear();
						for(int size = 0 ; (size = socket.read(rb)) > 0; ){
							currentResultSize += size;
							readSize += size;
							rb.flip();
							buffer.write(rb.array(), 0, size);
							rb.position(0);
							rb.clear();
							if(size < executeBufferSize)
								break;
						}
						
						ResponseParser parser = new ResponseParser();
						results = parser.parse(buffer.toByteArray());
						
						processComplete = true;
						
						break;

					}
				}
			}
		}finally{
			
		}
		
		return results;
	}
	
	public void close() throws IOException{
		socket.close();
	}
	
	public int getTimeout() {
		return timeout;
	}

	public void setTimeout(int timeout) {
		this.timeout = timeout;
	}

	public int getSendBufferSize() {
		return sendBufferSize;
	}

	public void setSendBufferSize(int sendBufferSize) {
		this.sendBufferSize = sendBufferSize;
	}

	public int getReceiveBufferSize() {
		return receiveBufferSize;
	}

	public void setReceiveBufferSize(int receiveBufferSize) {
		this.receiveBufferSize = receiveBufferSize;
	}

	public int getExecuteBufferSize() {
		return executeBufferSize;
	}

	public void setExecuteBufferSize(int executeBufferSize) {
		this.executeBufferSize = executeBufferSize;
	}

	public boolean isTcpNoDelay() {
		return tcpNoDelay;
	}

	public void setTcpNoDelay(boolean tcpNoDelay) {
		this.tcpNoDelay = tcpNoDelay;
	}
	
	public class Command{
		private static final String OPERATOR_OPEN_INDEX = "P";
		private static final String OPERATOR_INSERT = "+";
		private static final String OPERATOR_UPDATE = "U";
		private static final String OPERATOR_DELETE = "D";
		
		private static final String DEFAULT_ENCODING = "UTF-8";
		private String encoding = DEFAULT_ENCODING;
		
		public Command(){
			super();
		}
		
		public Command(String encoding){
			this();
			this.encoding = encoding;
		}
		
		/**
		 * @param id
		 * @param db
		 * @param table
		 * @param index
		 * @param fieldList
		 * @throws IOException
		 */
		public void openIndex(String id, String db, String table, String index, String fieldList) throws IOException{
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			DataOutputStream dos = new DataOutputStream(buffer);
			
			//header
			writeToken(dos, OPERATOR_OPEN_INDEX);
			writeTokenSeparator(dos);
			//id
			writeToken(dos, id);
			writeTokenSeparator(dos);
			//db
			writeToken(dos, db);
			writeTokenSeparator(dos);
			//table
			writeToken(dos, table);
			writeTokenSeparator(dos);
			//index
			writeToken(dos, index);
			writeTokenSeparator(dos);
			//field list
			writeToken(dos, fieldList);
			writeCommandTerminate(dos);
			
			dos.flush();
			
			commandBuffer.add(buffer.toByteArray());
		}

		/**
		 * @param id
		 * @param keys
		 * @throws IOException
		 */
		public void find(String id, String key) throws IOException{
			find(id, key , "=" , "1", "0");
		}
		
		/**
		 * @param id
		 * @param keys
		 * @param operator
		 * @param limit
		 * @param offset
		 * @throws IOException
		 */
		public void find(String id, String key, String operator , String limit, String offset) throws IOException{
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			DataOutputStream dos = new DataOutputStream(buffer);
			
			//id
			writeToken(dos, id);
			writeTokenSeparator(dos);
			//operator
			writeToken(dos, operator);
			writeTokenSeparator(dos);
			//key nums
			writeToken(dos, "1");
			writeTokenSeparator(dos);
			//key
			writeToken(dos, key);
			writeTokenSeparator(dos);
			//limit
			writeToken(dos, limit);
			writeTokenSeparator(dos);
			//offset
			writeToken(dos, offset);
			writeCommandTerminate(dos);
			
			dos.flush();
			
			commandBuffer.add(buffer.toByteArray());
		}
		
		/**
		 * @param id
		 * @param keys
		 * @throws IOException
		 */
		public void insert(String id, String key, byte[] value) throws IOException{
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			DataOutputStream dos = new DataOutputStream(buffer);
			//id
			writeToken(dos, id);
			writeTokenSeparator(dos);
			//operator
			writeToken(dos, OPERATOR_INSERT);
			writeTokenSeparator(dos);
			//key
			writeToken(dos, "2");
			writeTokenSeparator(dos);
			writeToken(dos, key == null ? null : key.getBytes(encoding));
		  writeTokenSeparator(dos);
			//value
			//String tv = new String(value).replaceAll("\\s", "hoge");
			
			writeToken(dos, value.length == 0 ? null : value);
			writeCommandTerminate(dos);	
			dos.flush();
			
			commandBuffer.add(buffer.toByteArray());
		}
		
		/**
		 * @param id
		 * @param keys
		 * @param operator
		 * @param limit
		 * @param offset
		 * @throws IOException
		 */
		public void findModifyDelete(String id, String key, String operator , String limit, String offset) throws IOException{
			findModify(id, key, operator, limit, offset, OPERATOR_DELETE, new byte[1]);
		}
		
		/**
		 * @param id
		 * @param keys
		 * @param operator
		 * @param limit
		 * @param offset
		 * @param values
		 * @throws IOException
		 */
		public void findModifyUpdate(String id, String key, String operator , String limit, String offset, byte[] value) throws IOException{
			findModify(id, key, operator, limit, offset, OPERATOR_UPDATE, value);
		}
		
		/**
		 * 
		 * @param id
		 * @param keys
		 * @param operator
		 * @param limit
		 * @param offset
		 * @param modOperation
		 * @param values
		 * @throws IOException
		 */
		private void findModify(
				String id, String key, String operator , String limit, String offset, 
				String modOperation, byte[] value) throws IOException{
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			DataOutputStream dos = new DataOutputStream(buffer);

			//id
			writeToken(dos, id);
			writeTokenSeparator(dos);
			//operator
			writeToken(dos, operator);
			writeTokenSeparator(dos);
			//key nums
			writeToken(dos, "1");
			writeTokenSeparator(dos);
			//key
			writeToken(dos, key == null ? null : key.getBytes(encoding));
			writeTokenSeparator(dos);
			//limit
			writeToken(dos, limit);
			writeTokenSeparator(dos);
			//offset
			writeToken(dos, offset);
			writeTokenSeparator(dos);
			//modify operator
			writeToken(dos, modOperation);
			writeTokenSeparator(dos);
			
			//modify value
			writeToken(dos, value.length == 0 ? null : value);
			writeCommandTerminate(dos);
			
			dos.flush();
			
			commandBuffer.add(buffer.toByteArray());
		}
		
		private void writeToken(DataOutputStream dos, String token) throws IOException{
			if(token == null){
				dos.writeByte(0x00);
			}else{
				for(char c : token.toCharArray()){
					if(c > 255){
						dos.writeChar(c);
					}else{
						dos.writeByte((byte)c);
						
					}
				}
			}
		}
		
		private void writeToken(DataOutputStream dos, byte[] token) throws IOException{
			if(token == null){
				dos.writeByte(0x00);
			}else{
				for(byte b : token){
					dos.writeByte(b);
				}
			}
		}
		
		private void writeTokenSeparator(DataOutputStream dos) throws IOException{
			dos.writeByte(TOKEN_SEPARATOR);
		}
		
		private void writeCommandTerminate(DataOutputStream dos) throws IOException{
			dos.writeByte(COMMAND_TERMINATE);
		}
	}
	
	class ResponseParser{
		private static final String DEFAULT_ENCODING = "UTF-8";
		private String encoding = DEFAULT_ENCODING;
		
		public ResponseParser(){
			super();
		}
		public ResponseParser(String encoding){
			this();
			this.encoding = encoding;
		}
		
		public List<HandlerSocketResult> parse(byte[] data) throws UnsupportedEncodingException{
			List<HandlerSocketResult> results = new ArrayList<HandlerSocketResult>();
			for(int i = 0 ; i < data.length ; ){
				byte[] messages = new byte[data.length];
				ByteArrayOutputStream buf = new ByteArrayOutputStream();

				HandlerSocketResult result = new HandlerSocketResult();
				int status = data[i] - 0x30 ; i++; if(i >= data.length) break;
				if(data[i] != 0x09)
					throw new RuntimeException(); //TOOD
				i++; if(i >= data.length) break;//0x09
				int fieldNum = data[i] - 0x30 ; i++; if(i >= data.length) break;
				
				if(data[i] == 0x0a){
					result.setStatus(status);
					result.setFieldNum(fieldNum);
					result.setMessages(messages);

					results.add(result);
					i++;//0x09 or 0x0a

					continue;
				}else{
					i++;//0x09 or 0x0a
				}
				
				while(true){
					if(data.length <= i)
						break;
					byte b = data[i];
					i++;
					if(b == COMMAND_TERMINATE){
						messages = buf.toByteArray();

						result.setStatus(status);
						result.setFieldNum(fieldNum);
						result.setMessages(messages);
						
						results.add(result);
						break;
					}
					/*if(b == TOKEN_SEPARATOR){
						messages.add(new String(buf.toByteArray(), encoding));
						buf = new ByteArrayOutputStream();
						continue;
					}*/
					buf.write(b);
				}
				
			}
			
			return results;
		}
		public String getEncoding() {
			return encoding;
		}
		public void setEncoding(String encoding) {
			this.encoding = encoding;
		}
		
		
	}
}
