package com.ligure.strategy;

/**
 * Created by Administrator on 2017/3/1.
 */
public class Client {
    public static void main(String[] args) {
        Context c = new Context(new Add());
        System.out.println("1+2=" + c.calc(1,2));
        c = new Context(new Sub());
        System.out.println("1-2=" + c.calc(1,2));
        c = new Context(new Mul());
        System.out.println("1*2=" + c.calc(1,2));
    }
}
