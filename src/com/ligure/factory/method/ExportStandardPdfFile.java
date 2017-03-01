package com.ligure.factory.method;

/**
 * Created by Administrator on 2017/2/27.
 */
public class ExportStandardPdfFile implements ExportFile {
    @Override
    public boolean export(String data) {
        System.out.println("导出标准PDF文件");
        return false;
    }
}
