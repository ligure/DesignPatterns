package com.ligure.decorator;

/**
 * Created by Administrator on 2017/2/28.
 */
public class Client {
    public static void main(String[] args) {
        Shap circle = new Circle();
        circle.draw();
        Shap redCircle = new RedShapDecorator(new Circle());
        redCircle.draw();
        Shap rectangle = new RedShapDecorator(new Rectangle());
        rectangle.draw();
    }
}
