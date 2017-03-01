package com.ligure.proxy;

/**
 * Created by Administrator on 2017/2/28.
 */
public class RealObject implements AbstractObject {
    @Override
    public void operate() {
        System.out.println("RealObject::operate()");
    }
}
