package com.ligure.chain;

/**
 * Created by Administrator on 2017/2/28.
 */
public abstract class AbstractLogger {
    public static final int INFO = 1;
    public static final int DEBUG = 2;
    public static final int ERROR = 3;
    protected int level;
    protected AbstractLogger next;
    public void setNext(AbstractLogger next) {
        this.next = next;
    }
    public void log(int level, String message) {
        if (this.level <= level) {
            write(message);
        }
        if (next != null) {
            next.log(level, message);
        }
    }
    public abstract void write(String msg);
}
