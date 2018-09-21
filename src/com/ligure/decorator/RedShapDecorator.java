package com.ligure.decorator;

/**
 * Created by Administrator on 2017/2/28.
 */
public class RedShapDecorator extends ShapeDecorator {
    public RedShapDecorator(Shap shap) {
        super(shap);
    }
    public void draw() {
        shap.draw();
        System.out.println("填充红色边框");
    }
}
