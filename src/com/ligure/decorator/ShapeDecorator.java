package com.ligure.decorator;

/**
 * Created by Administrator on 2017/2/28.
 */
public abstract class ShapeDecorator implements Shap {
    protected Shap decorator;
    public ShapeDecorator(Shap shap) {
        this.decorator = shap;
    }
    @Override
    public void draw() {
        decorator.draw();
    }
}
