package com.ligure.flyweight;

/**
 * Created by Administrator on 2017/2/28.
 */
public class Client {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        Shap red = factory.getCircle("red");
        red.draw();
        Shap blue = factory.getCircle("blue");
        blue.draw();
    }
}
