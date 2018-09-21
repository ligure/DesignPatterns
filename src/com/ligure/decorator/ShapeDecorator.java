package com.ligure.decorator;

/**
 * Created by Administrator on 2017/2/28.
 */
public abstract class ShapeDecorator implements Shap {
    protected Shap shap;
    public ShapeDecorator(Shap shap) {
        this.shap = shap;
    }
    @Override
    public void draw() {
        shap.draw();
        System.out.println("装饰点啥呢");
    }
}
