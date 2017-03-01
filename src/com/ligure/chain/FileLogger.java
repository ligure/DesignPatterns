package com.ligure.chain;

/**
 * Created by Administrator on 2017/2/28.
 */
public class FileLogger extends AbstractLogger {
    public FileLogger(int level) {
        this.level = level;
    }
    @Override
    public void write(String msg) {
        System.out.println("File Logger：" + msg);
    }
}
