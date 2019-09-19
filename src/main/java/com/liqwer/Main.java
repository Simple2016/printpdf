package com.liqwer;

import java.io.File;

/**
 *  打印出来是中文乱码， 不好用
 */
public class Main {
    public static void main(String[] args) {
        File file = new File(".");
        if (file.exists()) {
            File[] files = file.listFiles();
            if (null != files) {
                for (File file2 : files) {
                    if (!file2.isDirectory()) {
                        String absolutePath = file2.getAbsolutePath();
                        //System.out.println(absolutePath);
                        String[] split = absolutePath.split("\\.");
                        if (split.length > 0 && "pdf".equals(split[split.length - 1])) {
                            doPrint(absolutePath);
                            System.out.println("打印完成："+absolutePath);
                        }
                    }
                }
            }
        } else {
            System.out.println("文件不存在!");
        }
    }

    public static void doPrint(String pdfFile){
        File file = new File(pdfFile);
        String printerName = "Microsoft Print to PDF";//打印机名包含字串
        PdfPrintUtil.printPDF(file,printerName);
    }

}
