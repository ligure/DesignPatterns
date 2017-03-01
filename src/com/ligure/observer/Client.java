package com.ligure.observer;

/**
 * Created by Administrator on 2017/3/1.
 */
public class Client {
    public static void main(String[] args) {
        Subject s = new Subject();
        s.attach(new BinaryObserver());
        s.attach(new OctalObserver());
        s.attach(new HexObserver());
        s.setState(15);
        s.setState(10);
    }
}
