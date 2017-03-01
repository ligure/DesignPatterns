package com.ligure.visitor;

/**
 * Created by Administrator on 2017/3/1.
 */
public class Client {
    public static void main(String[] args) {
        Service s = new Service() {
            @Override
            public void accept(Visitor visitor) {
                visitor.visit(this);
            }
        };
        Visitor v = new VisitorImpl();
        s.accept(v);
        s = new CashService();
        s.accept(v);
        s = new FundService();
        s.accept(v);
        s = new TransferService();
        s.accept(v);
    }
}
