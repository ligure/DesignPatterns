package com.ligure.facade;

/**
 * Created by Administrator on 2017/2/28.
 */
public class ShapFacade {
    private Shap circle;
    private Shap square;
    private Shap rectangle;
    public ShapFacade() {
        circle = new Circle();
        square = new Square();
        rectangle = new Rectangle();
    }
    public void drawCircle(){
        circle.draw();
    }
    public void drawSquare(){
        square.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
}
