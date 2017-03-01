package com.ligure.command;

/**
 * Created by Administrator on 2017/2/28.
 */
public class Client {
    public static void main(String[] args) {
        CommandReceiver receiver = new CommandReceiver();
        BuyCommand buy = new BuyCommand(receiver);
        SellCommand sell = new SellCommand(receiver);
        CommandInvoker invoker = new CommandInvoker();
        invoker.addCommand(buy);
        invoker.addCommand(sell);
        invoker.execute();
    }
}
