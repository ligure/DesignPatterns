package com.ligure.factory.method;

/**
 * Created by Administrator on 2017/2/27.
 */
public class ExportPdfFactory implements ExportFactory {
    @Override
    public ExportFile create(String type) {
        if ("standard".equals(type)) {
            return new ExportStandardPdfFile();
        } else if ("financial".equals(type)) {
            return new ExportFinancialPdfFile();
        } else {
            throw new RuntimeException("没有找到对象");
        }
    }
}
