package com.ligure.factory.abstracts;

import com.ligure.factory.method.ExportFile;
import com.ligure.factory.method.ExportStandardHtmlFile;
import com.ligure.factory.method.ExportStandardPdfFile;

/**
 * Created by Administrator on 2017/2/27.
 */
public class ExportStandardFactory implements ExportFactory {
    @Override
    public ExportFile createHtml() {
        return new ExportStandardHtmlFile();
    }

    @Override
    public ExportFile createPdf() {
        return new ExportStandardPdfFile();
    }
}
