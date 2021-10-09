package com.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
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

        //method1(); //一个一个读  2490毫秒
        method2();//一次读多个   7毫秒
        //method3();//缓冲流复制文件  5毫秒
    }

    public static void  method3() throws IOException {
        long l = System.currentTimeMillis();

        //创建一个字节输入流对象，构造方法中绑定要读取的数据源
        FileInputStream fis = new FileInputStream("C:\\Users\\HWINWQ\\Desktop\\1.jpg");
        //创建 BufferedInputStream对象，构造方法中传递FileInputStream对象，提高FileInputStream对象效率
        BufferedInputStream bis = new BufferedInputStream(fis);

        //创建一个字节输出流对象，构造方法指定目的地
        FileOutputStream fos = new FileOutputStream("F:\\1.jpg");
        //创建 BufferedOutputStream对象，构造方法中传递FileOutputStream对象，提高FileOutputStream对象效率
        BufferedOutputStream bos = new BufferedOutputStream(fos);

//        int len = 0;
//        while ((len = bis.read()) != -1){
//            bos.write(len);
//        }
//        bos.close();
//        bis.close();
//        long e = System.currentTimeMillis();
//        System.out.println("复制图片共耗时："+(e-l)+"毫秒"); //33毫秒,这个是一个一个读


        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = bis.read(bytes)) !=-1){
            bos.write(bytes);
        }
        fos.close();
        fis.close();
        long e = System.currentTimeMillis();
        System.out.println("复制图片共耗时："+(e-l)+"毫秒"); //5毫秒
    }

    //用字节流 ，一次一个字节数组
    public static void method2() throws IOException {
        long l = System.currentTimeMillis();

        //封装数据源和目的地
        /**mac版本
         *  FileInputStream fis = new FileInputStream("o.JPG");
         *  FileOutputStream fos = new FileOutputStream("/Users/daixiongxing/Desktop/o.JPG");
         */
        //创建一个字节输入流对象，构造方法中绑定要读取的数据源
        FileInputStream fis = new FileInputStream("C:\\Users\\HWINWQ\\Desktop\\1.jpg");
        //创建一个字节输出流对象，构造方法指定目的地
        FileOutputStream fos = new FileOutputStream("F:\\1.jpg");

        //用字节流，读取多个字节
        byte[] bytes = new byte[1024];

        int len = 0;
        while ((len = fis.read(bytes)) !=-1){

            fos.write(bytes,0,len);
        }

        //释放资源

        fos.close();
        fis.close();
        long e = System.currentTimeMillis();
        System.out.println("复制图片共耗时："+(e-l)+"毫秒"); //7毫秒
    }



    //用字符流，一次一个字符
    //二进制流数据：图片 视屏 音频等，只能用字节流
    //此种方法不行
    public static void method1() throws IOException {
        long l = System.currentTimeMillis();
        //封装数据源和目的地
        //创建一个字节输入流对象，构造方法中绑定要读取的数据源
        FileInputStream fis = new FileInputStream("C:\\Users\\HWINWQ\\Desktop\\1.jpg");
        //创建一个字节输出流对象，构造方法指定目的地
        FileOutputStream fos = new FileOutputStream("F:\\1.jpg");
        //基本读取
        //字符流的方式
        int ch = 0;

        while ((ch = fis.read()) !=-1){

            fos.write(ch);
        }

        //释放资源

        fos.close();
        fis.close();
        long e = System.currentTimeMillis();
        System.out.println("复制图片共耗时："+(e-l)+"毫秒"); //2490毫秒
    }
}
