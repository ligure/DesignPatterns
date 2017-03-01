package com.ligure.bridge;

/**
 * Created by Administrator on 2017/2/28.
 */
public abstract class Connector {
    protected Driver driver;
    public Connector(Driver driver) {
        this.driver = driver;
    }
    public abstract void connect();
}
