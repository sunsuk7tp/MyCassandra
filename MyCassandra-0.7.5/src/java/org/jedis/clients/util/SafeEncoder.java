package org.jedis.clients.util;

import java.io.UnsupportedEncodingException;

import org.jedis.clients.Protocol;
import org.jedis.clients.exceptions.JedisDataException;
import org.jedis.clients.exceptions.JedisException;

/**
 * The only reason to have this is to be able to compatible with java 1.5 :(
 * 
 */
public class SafeEncoder {
    public static byte[] encode(final String str) {
        try {
            if (str == null) {
                throw new JedisDataException(
                        "value sent to redis cannot be null");
            }
            return str.getBytes(Protocol.CHARSET);
        } catch (UnsupportedEncodingException e) {
            throw new JedisException(e);
        }
    }

    public static String encode(final byte[] data) {
        try {
            return new String(data, Protocol.CHARSET);
        } catch (UnsupportedEncodingException e) {
            throw new JedisException(e);
        }
    }
}
