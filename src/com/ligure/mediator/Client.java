package com.ligure.mediator;

/**
 * Created by Administrator on 2017/3/1.
 */
public class Client {
    public static void main(String[] args) {
        Mediator m = new MediatorImpl();
        Colleague a = new Colleague("A");
        a.setMediator(m);
        Colleague b = new Colleague("B");
        b.setMediator(m);
        a.send("你好");
        b.notify(a);
        b.send("你好");
        a.notify(b);
    }
}
