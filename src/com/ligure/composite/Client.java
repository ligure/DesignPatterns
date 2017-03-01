package com.ligure.composite;

/**
 * Created by Administrator on 2017/2/27.
 */
public class Client {
    public static void main(String[] args) {
        Composite c = new Composite("服装");
        Composite c1 = new Composite("男装");
        Composite c11 = new Composite("衬衫");
        Composite c12 = new Composite("夹克");
        Composite c2 = new Composite("女装");
        Composite c21 = new Composite("裙子");
        Composite c22 = new Composite("套装");
        c.addChild(c1);
        c1.addChild(c11);
        c1.addChild(c12);
        c.addChild(c2);
        c2.addChild(c21);
        c2.addChild(c22);
        c.print();
    }
}
