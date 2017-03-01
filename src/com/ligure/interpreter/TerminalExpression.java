package com.ligure.interpreter;

/**
 * Created by Administrator on 2017/2/28.
 */
public class TerminalExpression implements Expression {
    @Override
    public int interpret(Context ctx) {
        return ctx.lookup(this);
    }
}
