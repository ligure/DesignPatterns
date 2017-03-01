package com.ligure.factory.method;

/**
 * Created by Administrator on 2017/2/27.
 */
public class ExportHtmlFactory implements ExportFactory {
    @Override
    public ExportFile create(String type) {
        if ("standard".equals(type)) {
            return new ExportStandardHtmlFile();
        } else if ("financial".equals(type)) {
            return new ExportFinancialHtmlFile();
        } else {
            throw new RuntimeException("没有找到对象");
        }
    }
}
