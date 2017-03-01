package com.ligure.factory.simple;

/**
 * Created by Administrator on 2017/2/24.
 */
public class PasswordLoginImpl implements ILogin {
    @Override
    public boolean verify(String name, String password) {
        System.out.println("数据库认证");
        return false;
    }
}
