package com.day09;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author wq
 * @since 2022-06-06 下午8:27
 * 获取Excel
 */

public class ExcelDemo {

    @Test
    //获取指定某一个表格的内容
    public void readSheet() throws IOException {
        //1.加载Excel

        FileInputStream fis = new FileInputStream("/Users/daixiongxing/Desktop/测试用例.xlsx");

        //2.利用poi解析Excel
        Workbook sheets = WorkbookFactory.create(fis);

        //3.获取某一个表格
        Sheet sheet = sheets.getSheetAt(0);

        //4.获取行
        Row row = sheet.getRow(1);

        //5.获取列（表格）
        Cell cell = row.getCell(3);
        System.out.println(cell);

    }

    //获取所有的表格内容
    @Test
    public void getAllContent() throws IOException {

        //1.读取表格位置
        FileInputStream fis = new FileInputStream("/Users/daixiongxing/Desktop/测试用例.xlsx");

        //2.获取表格
        Workbook sheets = WorkbookFactory.create(fis);

        //3.循环获取所有数据

        for (Sheet sheet : sheets) {

            for (Row cells : sheet) {

                for (Cell cell : cells) {
                    System.out.print(cell+"     ");
                }
                System.out.println();
            }
        }
    }

}

