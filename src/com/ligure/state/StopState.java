package com.ligure.state;

/**
 * Created by Administrator on 2017/3/1.
 */
public class StopState implements State {
    @Override
    public void handle(String message) {
        System.out.println("结束：" + message);
    }
}
