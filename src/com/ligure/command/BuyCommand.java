package com.ligure.command;

/**
 * Created by Administrator on 2017/2/28.
 */
public class BuyCommand implements OrderCommand {
    private CommandReceiver receiver;
    public BuyCommand(CommandReceiver receiver) {
        this.receiver = receiver;
    }
    @Override
    public void execute() {
        receiver.inBound();
    }
}
