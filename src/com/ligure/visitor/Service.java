package com.ligure.visitor;

/**
 * Created by Administrator on 2017/3/1.
 */
public interface Service {
    public void accept(Visitor visitor);
}
