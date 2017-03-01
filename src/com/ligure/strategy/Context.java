package com.ligure.strategy;

/**
 * Created by Administrator on 2017/3/1.
 */
public class Context {
    Strategy s;
    public Context(Strategy s) {
        this.s = s;
    }
    public int calc(int a, int b) {
        return s.calc(a, b);
    }
}
