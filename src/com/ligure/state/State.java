package com.ligure.state;

/**
 * Created by Administrator on 2017/3/1.
 */
public interface State {
    public void handle(String message);
}
