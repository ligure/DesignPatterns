package com.ligure.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/3/1.
 */
public class Subject {
    private int state;
    private List<Observer> list = new ArrayList<Observer>();
    public int getState() {
        return state;
    }
    public void setState(int state) {
        this.state = state;
        notified();
    }
    public void attach(Observer o) {
        list.add(o);
    }
    public void detach(Observer o) {
        list.remove(o);
    }
    public void notified() {
        for (Observer o : list) {
            o.update(state);
        }
    }
}
