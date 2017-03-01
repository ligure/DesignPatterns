package com.ligure.builder;

/**
 * Created by Administrator on 2017/2/27.
 */
public class ComputerBuilder implements Builder {
    private Computer computer = new Computer();
    @Override
    public void setMainboard() {
        computer.setMainboard("华硕");
    }
    @Override
    public void setCPU() {
        computer.setCpu("Intel");
    }
    @Override
    public Computer ok() {
        return computer;
    }
}
