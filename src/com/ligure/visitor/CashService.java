package com.ligure.visitor;

/**
 * Created by Administrator on 2017/3/1.
 */
public class CashService implements Service{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}