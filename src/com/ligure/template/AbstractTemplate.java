package com.ligure.template;

/**
 * Created by Administrator on 2017/3/1.
 */
public abstract class AbstractTemplate {
    public void templateMethod() {
        doInit();
        doWork();
        doHook();
    }
    protected abstract void doWork();
    protected void doHook() {
        //钩子方法
    }
    private final void doInit() {
        System.out.println("父类初始化了");
    }
}
