package com.ligure.observer;

/**
 * Created by Administrator on 2017/3/1.
 */
public class BinaryObserver extends Observer {
    @Override
    public void update(int state) {
        this.state = state;
        System.out.println("Binary String: " + Integer.toBinaryString(state));
    }
}
