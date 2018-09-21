package com.ligure.observer;

/**
 * Created by Administrator on 2017/3/1.
 */
public abstract class Observer {
    protected int state;
    public abstract void update(Subject subject);
}
