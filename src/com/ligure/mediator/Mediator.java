package com.ligure.mediator;

/**
 * Created by Administrator on 2017/3/1.
 */
public interface Mediator {
    public void send(Colleague colleague, String message);
}
