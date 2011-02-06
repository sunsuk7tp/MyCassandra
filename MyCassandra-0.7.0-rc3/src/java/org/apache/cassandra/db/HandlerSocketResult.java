package org.apache.cassandra.db;

import java.util.ArrayList;
import java.util.List;

public class HandlerSocketResult {
	private int status;
	private int fieldNum;
	private byte[] messages;

	public HandlerSocketResult(){
		super();
	}
	
	public HandlerSocketResult(int status, int fieldNum, byte[] messages){
		this();
		this.status = status;
		this.fieldNum = fieldNum;
		this.messages = messages;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getFieldNum() {
		return fieldNum;
	}

	public void setFieldNum(int fieldNum) {
		this.fieldNum = fieldNum;
	}

	public byte[] getMessages() {
		return messages;
	}

	public void setMessages(byte[] messages) {
		this.messages = messages;
	}
	
	@Override
	public String toString(){
		StringBuilder builder = new StringBuilder();
		builder.append(status).append("\t");
		builder.append(fieldNum).append("\t");
		builder.append(new String(messages)).append("\t");
		
		return builder.toString();
	}
}
