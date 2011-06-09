package org.apache.cassandra.io.util;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.IOException;

public class DataInputBuffer extends DataInputStream {
    private static class Buffer extends ByteArrayInputStream
    {
        public Buffer(byte[] buf, int offset, int length) {
			super(buf, offset, length);
		}

		public void setData(byte[] buf)
        {
            this.buf = buf;
        }
        
        public void setLength(int count)
        {
            this.count = count;
        }
        
        public void reset()
        {
            count = 0;
        }
        
        public byte[] read(DataOutput out, int len) throws IOException
        {
            int newcount = count + len;
            byte newbuf[] = null;
            if (newcount > buf.length)
            {
                newbuf = new byte[Math.max(buf.length << 1, newcount)];
                System.arraycopy(buf, 0, newbuf, 0, count);
                buf = newbuf;
            }
            out.write(buf, count, len);
            count = newcount;
            
			return newbuf;
        }
    }
    
    private Buffer buffer;
    
	public DataInputBuffer(byte[] buf, int offset, int length) {
		this(new Buffer(buf, offset, length));
	}
	
	private DataInputBuffer(Buffer buffer) {
		super(buffer);
		this.buffer = buffer;
	}
	
	public void setData(byte[] buf)
	{
		buffer.setData(buf);
	}
	
	public void setLength(int length)
	{
		buffer.setLength(length);
	}
	
	public void reset()
	{
		buffer.reset();
	}
	
	public byte[] read(DataOutput out, int length) throws IOException
	{
		return buffer.read(out, length);
	}
}
