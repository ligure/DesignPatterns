package com.ligure.command;

/**
 * Created by Administrator on 2017/2/28.
 */
public class SellCommand implements OrderCommand {
    private CommandReceiver receiver;
    public SellCommand(CommandReceiver receiver) {
        this.receiver = receiver;
    }
    @Override
    public void execute() {
        receiver.outBound();
    }
}
