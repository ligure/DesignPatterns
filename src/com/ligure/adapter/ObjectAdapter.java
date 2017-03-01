package com.ligure.adapter;

/**
 * Created by Administrator on 2017/2/27.
 */
public class ObjectAdapter {
    private Adaptee adaptee;
    public ObjectAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }
    public void method1() {
        adaptee.method1();
    }
    public void method2() {
    }
}
