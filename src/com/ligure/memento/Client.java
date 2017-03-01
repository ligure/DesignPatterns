package com.ligure.memento;

/**
 * Created by Administrator on 2017/3/1.
 */
public class Client {
    public static void main(String[] args) {
        Originator o = new Originator();
        Caretaker c = new Caretaker();
        o.setState("ready");
        c.add(o.createMemento());
        o.setState("running");
        c.add(o.createMemento());
        o.setState("done");
        c.add(o.createMemento());
        System.out.println("Current State: " + o.getState());
        o.restoreMemento(c.get(0));
        System.out.println("Current State: " + o.getState());
        o.restoreMemento(c.get(1));
        System.out.println("Current State: " + o.getState());
        o.restoreMemento(c.get(2));
        System.out.println("Current State: " + o.getState());
    }
}
