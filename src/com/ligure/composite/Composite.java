package com.ligure.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/2/27.
 */
public class Composite implements Component {
    private int level;
    private String name;
    private List<Component> child = new ArrayList<Component>();
    public Composite(String name) {
        this.name = name;
    }
    @Override
    public void setLevel(int level) {
        this.level = level;
    }
    @Override
    public int getLevel() {return this.level;}
    public void addChild(Component c) {
        c.setLevel(this.level + 1);
        child.add(c);
    }
    public void removeChild(int i) {
        child.remove(i);
    }
    @Override
    public void print() {
        for (int i = 0; i < this.level * 2; i++) {
            System.out.print(" ");
        }
        System.out.println(this.name);
        if (this.child != null) {
            for (Component c : child) {
                c.print();
            }
        }
    }
}
