package com.ligure.factory.simple;

/**
 * Created by Administrator on 2017/2/24.
 */
public interface ILogin {
    //登录验证
    public boolean verify(String name, String password);
}
