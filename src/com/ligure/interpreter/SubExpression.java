package com.ligure.interpreter;

/**
 * Created by Administrator on 2017/2/28.
 */
public class SubExpression implements Expression {
    private Expression expr1;
    private Expression expr2;
    public SubExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }
    @Override
    public int interpret(Context ctx) {
        return expr1.interpret(ctx) - expr2.interpret(ctx);
    }
}
