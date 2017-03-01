package com.ligure.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/2/28.
 */
public class CommandInvoker {
    private List<OrderCommand> commandList = new ArrayList<OrderCommand>();
    public void addCommand(OrderCommand command){
        commandList.add(command);
    }
    public void execute(){
        for (OrderCommand command : commandList) {
            command.execute();
        }
        commandList.clear();
    }
}
