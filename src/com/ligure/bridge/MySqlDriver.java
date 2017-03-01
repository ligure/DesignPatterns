package com.ligure.bridge;

/**
 * Created by Administrator on 2017/2/27.
 */
public class MySqlDriver implements Driver {
    @Override
    public void connect() {
        System.out.println("连接MySQL数据库");
    }
}
