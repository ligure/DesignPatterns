package com.ligure.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/3/1.
 */
public class Caretaker {
    private List<Memento> list = new ArrayList<Memento>();
    public void add(Memento m) {
        list.add(m);
    }
    public Memento get(int index) {
        return list.get(index);
    }
}
