package com.ligure.flyweight;

/**
 * Created by Administrator on 2017/2/28.
 */
public class Circle implements Shap {
    private String color;
    public Circle(String color) {
        this.color = color;
    }
    @Override
    public void draw() {
        System.out.println("draw a " + color + "circle");
    }
}
