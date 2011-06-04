package org.jedis.clients;

public abstract class Builder<T> {
    public abstract T build(Object data);
}
