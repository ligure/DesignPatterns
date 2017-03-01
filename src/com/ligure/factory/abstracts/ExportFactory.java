package com.ligure.factory.abstracts;

import com.ligure.factory.method.ExportFile;

/**
 * Created by Administrator on 2017/2/27.
 */
public interface ExportFactory {
    public ExportFile createHtml();
    public ExportFile createPdf();
}
