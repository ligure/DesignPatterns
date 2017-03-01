package com.ligure.proxy;

/**
 * Created by Administrator on 2017/2/28.
 */
public class Client {
    public static void main(String[] args) {
        AbstractObject object = new ProxyObject();
        object.operate();
    }
}
