package com.ligure.bridge;

/**
 * Created by Administrator on 2017/2/27.
 */
public class OracleDriver implements Driver {
    @Override
    public void connect() { System.out.println("连接Oracle数据库"); }
}
