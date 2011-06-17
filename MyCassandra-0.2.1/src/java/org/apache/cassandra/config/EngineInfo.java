package org.apache.cassandra.config;

public class EngineInfo
{
    /*
     * Symbol name of this Storage Engine
     */
    public String name;

    /*
     * basic parameters
     */
    public String host;
    public int port;
    public String user;
    public String pass;
    public String dir;

    /*
     *  For Kyoto Cabinet parameters
    */
    public String kcclass;
}
