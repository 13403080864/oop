package com.day11TestNG;

import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ImportParams;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.util.List;

/**
 * @author wq
 * @since 2022-06-10 15:26
 */

public class RegisterTest {
    @Test(groups = {"group"})
    public void test(){
        System.out.println("注册的类的测试方法");
    }



    @Test(dataProvider = "datas")
    public void test1(CaseInfo caseInfo){

        System.out.println(caseInfo.getCaseId());
        System.out.println(caseInfo.getTitle());
        System.out.println(caseInfo.getInterfaces());
        System.out.println(caseInfo.getRequestHeader());
        System.out.println(caseInfo.getMethod());
        System.out.println(caseInfo.getUrl());
        System.out.println(caseInfo.getExpected());

    }


    @DataProvider
    public Object[] datas() throws Exception {
//        //获取excel位置
        FileInputStream fis = new FileInputStream("src/main/resources/api_testcases_futureloan_v1.xls");
        //加载导入配置
        ImportParams importParams = new ImportParams();
        //读取excel,ExcelImportUtil.importExcel读取，参数（excel对象流，映射类.class，导入参数）
        List<CaseInfo> list = ExcelImportUtil.importExcel(fis, CaseInfo.class, importParams);

        //list转换为数组
        Object[] caseInfo = list.toArray();


        return caseInfo;


    }
}
