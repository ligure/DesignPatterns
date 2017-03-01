package com.ligure.factory.method;

/**
 * Created by Administrator on 2017/2/27.
 */
public class ExportStandardHtmlFile implements ExportFile {
    @Override
    public boolean export(String data) {
        System.out.println("导出标准HTML文件");
        return false;
    }
}
