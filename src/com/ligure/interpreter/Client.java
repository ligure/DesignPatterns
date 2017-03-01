package com.ligure.interpreter;

/**
 * Created by Administrator on 2017/2/28.
 */
public class Client {
    public static void main(String[] args) {
        Expression a = new TerminalExpression();
        Expression b = new TerminalExpression();
        Context ctx = new Context();
        ctx.assign(a,1);
        ctx.assign(b,2);
        System.out.println(a.interpret(ctx));
        System.out.println(b.interpret(ctx));
        Expression add = new AddExpression(a,b);
        System.out.println(add.interpret(ctx));
        Expression sub = new SubExpression(a,b);
        System.out.println(sub.interpret(ctx));
    }
}
