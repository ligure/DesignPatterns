package com.ligure.factory.abstracts;

import com.ligure.factory.method.ExportFile;
import com.ligure.factory.method.ExportFinancialHtmlFile;
import com.ligure.factory.method.ExportFinancialPdfFile;

/**
 * Created by Administrator on 2017/2/27.
 */
public class ExportFinancialFactory implements ExportFactory {
    @Override
    public ExportFile createHtml() {
        return new ExportFinancialHtmlFile();
    }

    @Override
    public ExportFile createPdf() {
        return new ExportFinancialPdfFile();
    }
}
