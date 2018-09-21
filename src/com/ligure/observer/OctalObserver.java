package com.ligure.observer;

/**
 * Created by Administrator on 2017/3/1.
 */
public class OctalObserver extends Observer {
    @Override
    public void update(Subject subject) {
        this.state = subject.getState();
        System.out.println("Octal String: " + Integer.toOctalString(state));
    }
}
