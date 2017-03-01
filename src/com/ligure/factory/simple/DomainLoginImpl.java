package com.ligure.factory.simple;

/**
 * Created by Administrator on 2017/2/24.
 */
public class DomainLoginImpl implements ILogin {
    @Override
    public boolean verify(String name, String password) {
        System.out.println("域账户认证");
        return false;
    }
}
