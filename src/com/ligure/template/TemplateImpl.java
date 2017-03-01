package com.ligure.template;

/**
 * Created by Administrator on 2017/3/1.
 */
public class TemplateImpl extends AbstractTemplate{
    @Override
    protected void doWork() {
        System.out.println("子类开始工作了");
    }
    @Override
    protected void doHook() {
        System.out.println("子类完成工作了");
    }
}
