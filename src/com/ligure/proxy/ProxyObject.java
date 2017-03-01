package com.ligure.proxy;

/**
 * Created by Administrator on 2017/2/28.
 */
public class ProxyObject implements AbstractObject {
    RealObject realObject = new RealObject();
    @Override
    public void operate() {
        System.out.println("before");
        realObject.operate();
        System.out.println("after");
    }
}
