package com.ligure.visitor;

/**
 * Created by Administrator on 2017/3/1.
 */
public class VisitorImpl implements Visitor {
    @Override
    public void visit(Service service) {
        System.out.println("基本业务");
    }
    @Override
    public void visit(CashService service) {
        System.out.println("现金业务");
    }
    @Override
    public void visit(FundService service) {
        System.out.println("基金业务");
    }
    @Override
    public void visit(TransferService service) {
        System.out.println("汇款业务");
    }
}
