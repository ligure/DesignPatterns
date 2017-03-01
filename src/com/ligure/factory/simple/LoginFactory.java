package com.ligure.factory.simple;

/**
 * Created by Administrator on 2017/2/24.
 */
public class LoginFactory {
    public static ILogin create(String type) {
        if (type.equalsIgnoreCase("password")) {
            return new PasswordLoginImpl();
        } else if (type.equalsIgnoreCase("domain")) {
            return new DomainLoginImpl();
        } else {
            throw new RuntimeException("没有找到登录类型");
        }
    }
}
