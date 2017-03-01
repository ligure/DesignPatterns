package com.ligure.visitor;

/**
 * Created by Administrator on 2017/3/1.
 */
public interface Visitor {
    public void visit(Service service);
    public void visit(CashService service);
    public void visit(FundService service);
    public void visit(TransferService service);
}
