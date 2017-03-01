package com.ligure.facade;

/**
 * Created by Administrator on 2017/2/28.
 */
public class Client {
    public static void main(String[] args) {
        ShapFacade facade = new ShapFacade();
        facade.drawCircle();
        facade.drawSquare();
        facade.drawRectangle();
    }
}
