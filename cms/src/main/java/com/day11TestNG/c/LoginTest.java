package com.day11TestNG.c;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

/**
 * @author wq
 * @since 2022-06-10 15:05
 */

public class LoginTest {
    @Test
    public void test1(){
        System.out.println("login类的测试方法");
    }


    @BeforeSuite
    public void BeforeGroups(){
        System.out.println("TestNGTest类之前运行；全局初始化操作");
    }

    @BeforeClass
    public void BeforeClass(){
        System.out.println("登陆测试类执行开始");
    }

    @AfterClass
    public void AfterClass(){
        System.out.println("登陆测试类执行结束");
    }

    @BeforeMethod
    public void BeforeloginSuccess(){
        System.out.println("登陆测试方法执行开始");
    }

    @AfterMethod
    public void AfterloginSuccess(){
        System.out.println("登陆测试方法执行结束");
    }
}
