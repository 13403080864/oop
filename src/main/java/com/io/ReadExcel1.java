package com.io;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @author wq
 * @since 2022-05-17 下午10:51
 */

public class ReadExcel1 {

    public static void main(String[] args) throws Exception {

        //readExcel();
        //writeExcel();
        writeExcel1();
    }

    public static void readExcel() throws Exception {

        //找到位置excel,指定文件的地址
        FileInputStream fis = new FileInputStream("/Users/daixiongxing/Desktop/工作簿1.xlsx");

        //再双击打开表格
        Workbook workbook = WorkbookFactory.create(fis);

        //找到sheet，就是可能会有很多个sheet,这里获取第一个表格
        Sheet sheet = workbook.getSheetAt(0);

        //找到行，有多行，需要用循环
        //获取最后一行，获取最大范围
        int lastRowNum = sheet.getLastRowNum();
        //System.out.println("zuohou一行"+lastRowNum);
        //注意读取行的索引是从0 开始的
        for (int i = 1; i <= lastRowNum; i++) {
            //获取行
            Row row = sheet.getRow(i);

            //获取最后的一个格
            int lastCellNum = row.getLastCellNum();
            System.out.println("最后一格为："+lastCellNum);
            //获取列
            //注意读取格的索引是从1 开始的
            for (int j = 0; j < lastCellNum ; j++) {
                //获取格
                Cell cell = row.getCell(j);
                //设置格里面的内容为字符串，因为它有可能是别的数字类型，所有的都转换为字符串
                cell.setCellType(CellType.STRING);

                //获取字符串类型的数据
                String value = cell.getStringCellValue();

                System.out.print(value + ",");

            }
            System.out.println();

        }
        //关闭资源
        fis.close();
    }



    //写入数据到Excel
    public static void writeExcel() throws Exception {

        //找到位置excel,指定文件的地址
        FileInputStream fis = new FileInputStream("/Users/daixiongxing/Desktop/工作簿1.xlsx");

        //打开表格
        Workbook workbook = WorkbookFactory.create(fis);

        //获取sheet
        Sheet sheet = workbook.getSheetAt(0);

        //获取行,加入这里获取第二行
        //注意写入时获取行的索引是从0 开始的
        Row row = sheet.getRow(2);
        //修改数据，修改第二行，第二格的数据
        //注意写入时获取格的索引是从1 开始的
        Cell cell = row.getCell(1);  //获取第二格的位置
        //修改数据
        cell.setCellType(CellType.STRING); //设置字符串的类型
        //s设置值
        cell.setCellValue("join");


        //关联excel
        FileOutputStream fos = new FileOutputStream("/Users/daixiongxing/Desktop/工作簿1.xlsx");
        workbook.write(fos);

        fos.close();
        fis.close();
    }





    //写入数据到Excel
    public static void writeExcel1() throws Exception {

        //找到位置excel,指定文件的地址
        FileInputStream fis = new FileInputStream("/Users/daixiongxing/Desktop/工作簿1.xlsx");

        //打开表格
        Workbook workbook = WorkbookFactory.create(fis);

        //获取sheet
        Sheet sheet = workbook.getSheetAt(0);


        //获取行,加入这里获取第二行
        //注意写入时获取行的索引是从0 开始的
//        int lastRowNum = sheet.getLastRowNum();
//        Row row = null;
//        for (int i = 1; i <=lastRowNum; i++) {
//
//            //注意写入时获取格的索引是从0 开始的
//            row = sheet.getRow(i);
//            //注意写入时获取格的索引是从0 开始的
//            Cell cell = row.getCell(3);
//            cell.setCellType(CellType.STRING); //设置字符串的类型
//
//            cell.setCellValue("join");
//            //s设置值
//
//        }

        Row row = sheet.getRow(2);
        Cell cell = row.getCell(2);
        cell.setCellType(CellType.STRING); //设置字符串的类型


        //关联excel
        FileOutputStream fos = new FileOutputStream("/Users/daixiongxing/Desktop/工作簿1.xlsx");
        workbook.write(fos);

        fos.close();
        fis.close();
    }


}
