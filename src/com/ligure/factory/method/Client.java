package com.ligure.factory.method;

/**
 * Created by Administrator on 2017/2/27.
 */
public class Client {
    public static void main(String[] args) {
        ExportFactory factory = new ExportHtmlFactory();
        ExportFile ef = factory.create("standard");
        ef.export("");
        ef = factory.create("financial");
        ef.export("");
    }
}
