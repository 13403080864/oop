package com.day10;

import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ImportParams;
import com.day11TestNG.CaseInfo;

import java.io.FileInputStream;
import java.util.List;

/**
 * @author wq
 * @since 2022-06-07 9:37
 * easyPOI读取
 */

public class ReadExcel1 {
    public static void main(String[] args) throws Exception {
        //获取excel位置
        FileInputStream fis = new FileInputStream("/Users/daixiongxing/D/hlwproject/oop/cms/src/main/resources/api_testcases_futureloan_v1.xls");
        //加载导入配置
        ImportParams importParams = new ImportParams();
        //读取excel,ExcelImportUtil.importExcel读取，参数（excel对象流，映射类.class，导入参数）
        List<CaseInfo> list = ExcelImportUtil.importExcel(fis, CaseInfo.class, importParams);
        //创建一个数组
        CaseInfo[] caseInfos = new CaseInfo[list.size()];
        for (int i = 0; i < list.size(); i++) {
            caseInfos[i] = list.get(i);
        }
        for (int i = 0; i < caseInfos.length; i++) {
            System.out.println(caseInfos[i]);
        }
    }
}
