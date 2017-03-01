package com.ligure.state;

/**
 * Created by Administrator on 2017/3/1.
 */
public class Context {
    private State state;
    public State getState() {
        return state;
    }
    public void setState(State state) {
        this.state = state;
    }
    public void handle(String message) {
        state.handle(message);
    }
}
