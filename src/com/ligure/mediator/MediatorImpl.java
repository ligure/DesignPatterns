package com.ligure.mediator;

/**
 * Created by Administrator on 2017/3/1.
 */
public class MediatorImpl implements Mediator {
    @Override
    public void send(Colleague c, String message) {
        System.out.println(c.getName() + "说：" + message);
    }
}
