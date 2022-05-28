package com.io.bufferedWriterAndBuffteredReader;

import org.junit.Test;

import java.io.IOException;

/**
 * @author wq
 * @since 2022-05-16 下午9:11
 */

public class CopyFengzhuangTest {
    @Test
    public  void test1() throws IOException {

        String read = "a.txt";
        String write = "/Users/daixiongxing/d/aa.txt";
        //调用复制方法
        CopyFengzhuang c = new CopyFengzhuang();
        c.copyFile(read,write);
    }

    @Test
    public void test2() throws IOException {

        String read = "ssm.jpg";
        String write = "/Users/daixiongxing/d/ssm.jpg";

        //调用复制方法
        CopyFengzhuang c = new CopyFengzhuang();
        c.copyImage(read,write);
    }
}
