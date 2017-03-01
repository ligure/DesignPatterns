package com.ligure.chain;

/**
 * Created by Administrator on 2017/2/28.
 */
public class ConsoleLogger extends AbstractLogger {
    public ConsoleLogger(int level) {
        this.level = level;
    }
    @Override
    public void write(String msg) {
        System.out.println("Console Logger：" + msg);
    }
}
