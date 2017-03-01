package com.ligure.strategy;

/**
 * Created by Administrator on 2017/3/1.
 */
public class Mul implements Strategy {
    @Override
    public int calc(int a, int b) {
        return a * b;
    }
}
