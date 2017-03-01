package com.ligure.builder;

/**
 * Created by Administrator on 2017/2/27.
 */
public class Director {
    private Builder builder;
    public Director(Builder builder) {
        this.builder = builder;
    }
    public void construct() {
        builder.setMainboard();
        builder.setCPU();
    }
}
