package com.ligure.flyweight;

import java.util.HashMap;

/**
 * Created by Administrator on 2017/2/28.
 */
public class ShapeFactory {
    public static final HashMap<String, Circle> map = new HashMap<String, Circle>();
    public static Shap getCircle(String color) {
        Circle circle = (Circle) map.get(color);
        if (circle == null) {
            circle = new Circle(color);
            map.put(color, circle);
        }
        return circle;
    }
}