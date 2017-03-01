package com.ligure.observer;

/**
 * Created by Administrator on 2017/3/1.
 */
public class OctalObserver extends Observer {
    @Override
    public void update(int state) {
        this.state = state;
        System.out.println("Octal String: " + Integer.toOctalString(state));
    }
}
