package com.ligure.factory.simple;

/**
 * Created by Administrator on 2017/2/24.
 */
public class Client {
    public static void main(String[] args) {
        ILogin login = LoginFactory.create("password");
        login.verify("","");
        login = LoginFactory.create("domain");
        login.verify("","");
    }
}
