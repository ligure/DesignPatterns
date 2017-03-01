package com.ligure.state;

/**
 * Created by Administrator on 2017/3/1.
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        State start = new StartState();
        context.setState(start);
        context.handle("JAVA");
        State stop = new StopState();
        context.setState(stop);
        context.handle("JAVA");
    }
}
