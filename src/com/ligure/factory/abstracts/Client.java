package com.ligure.factory.abstracts;

import com.ligure.factory.method.ExportFile;

/**
 * Created by Administrator on 2017/2/27.
 */
public class Client {
    public static void main(String[] args) {
        ExportFactory factory = new ExportStandardFactory();
        ExportFile ef = factory.createHtml();
        ef.export("");
        ef = factory.createPdf();
        ef.export("");
    }
}
