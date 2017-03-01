package com.ligure.mediator;

/**
 * Created by Administrator on 2017/3/1.
 */
public class Colleague {
    private String name;
    private Mediator mediator;
    public Colleague(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
    public void send(String message) {
        mediator.send(this, message);
    }
    public void notify(Colleague c) {
        System.out.println(name + "收到" + c.getName() + "发来的消息");
    }
}
