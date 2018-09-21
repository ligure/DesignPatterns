package com.ligure.observer;

/**
 * Created by Administrator on 2017/3/1.
 */
public class BinaryObserver extends Observer {
    @Override
    public void update(Subject subject) {
        this.state = subject.getState();
        System.out.println("Binary String: " + Integer.toBinaryString(state));
    }
}
