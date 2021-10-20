package com.junit;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

/**
 * @author wq
 * @since 2021-10-19 18:59
 */
public class JunitTest {
    //Before 方法前执行
    @Before
    public void init(){
        System.out.println("init...");
    }
    @After
    public void close(){
        System.out.println("close...");
    }
    @Test
  public void testAdd(){
        Calculator c = new Calculator();
        int add = c.add(1, 2);
        //单元测试中一般不用输出语句，看不出真正的结果
        //用Assertions，结果和期望值一直结果绿色，不一致红色
        Assertions.assertEquals(3,add);
        System.out.println("testAdd");
    }

}
