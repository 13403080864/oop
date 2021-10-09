package com.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author
 * @since 2021-10-06 下午12:46
 *
 *
 * 复制图片
 *      1，用字符流
 *      2，用字节流
 *
 *   二进制流数据：图片 视屏 音频等，只能用字节流
 */

public class CopyImage {

    public static void main(String[] args) throws IOException {

        //method1(); 字符流
        method2();
    }

    //用字节流 ，一次一个字节数组
    public static void method2() throws IOException {

        //封装数据源和目的地
        //
        FileInputStream fis = new FileInputStream("o.JPG");
        FileOutputStream fos = new FileOutputStream("/Users/daixiongxing/Desktop/o.JPG");

        //用字节流
        byte[] bytes = new byte[1024];

        int len = 0;
        while ((len = fis.read()) !=-1){

            fos.write(bytes,0,len);
        }

        //释放资源

        fos.close();
        fis.close();
    }



    //用字符流，一次一个字符
    //二进制流数据：图片 视屏 音频等，只能用字节流
    //此种方法不行
    public static void method1() throws IOException {

        //封装数据源和目的地

        FileReader fr = new FileReader("050308582D7E5BC65FBBF4C021D3FFCD.gif");

        //FileWriter fw = new FileWriter("e：\\mn.jpg");
        FileWriter fw = new FileWriter("/Users/daixiongxing/Desktop/050308582D7E5BC65FBBF4C021D3FFCD.gif");

        //基本读取
        //字符流的方式
        int ch = 0;

        while ((ch = fr.read()) !=-1){

            fw.write(ch);
        }

        //释放资源

        fw.close();
        fr.close();
    }
}
