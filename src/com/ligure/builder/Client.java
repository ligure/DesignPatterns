package com.ligure.builder;

/**
 * Created by Administrator on 2017/2/27.
 */
public class Client {
    public static void main(String[] args) {
        Builder builder = new ComputerBuilder();
        Director director = new Director(builder);
        director.construct();
        Computer computer = builder.ok();
        System.out.println(computer.getMainboard());
        System.out.println(computer.getCpu());
    }
}
