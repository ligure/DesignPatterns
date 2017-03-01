package com.ligure.observer;

/**
 * Created by Administrator on 2017/3/1.
 */
public class HexObserver extends Observer {
    @Override
    public void update(int state) {
        this.state = state;
        System.out.println("Hex String: " + Integer.toHexString(state));
    }
}
