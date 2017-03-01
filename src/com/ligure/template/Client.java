package com.ligure.template;

/**
 * Created by Administrator on 2017/3/1.
 */
public class Client {
    public static void main(String[] args) {
        AbstractTemplate t = new TemplateImpl();
        t.templateMethod();
    }
}
