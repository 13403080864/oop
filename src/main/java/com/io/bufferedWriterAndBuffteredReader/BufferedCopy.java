package com.io.bufferedWriterAndBuffteredReader;

import org.junit.Test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author wq
 * @since 2022-05-16 下午10:05
 */

public class BufferedCopy {

    /**
     * 基本字节流一次读写一个字节：76毫秒
     * 基本字节流一次读写一个字节数组：1毫秒
     * 高效字节流一次读写一个字节：2毫秒
     * 高效字节流一次读写一个字节数组：0毫秒  一般用高效的这个
     */

    //高效字节流一次读写一个字节数组： 一般用高效的这个
    //常用的
    @Test
    public void test() throws IOException {

        long start = System.currentTimeMillis();

        BufferedInputStream fis = new BufferedInputStream(new FileInputStream("1.html"));
        BufferedOutputStream fos = new BufferedOutputStream(new FileOutputStream("11.html"));

        byte[] chars = new byte[1024];
        int len = 0;
        while ((len = fis.read(chars)) != -1){
            fos.write(chars);
        }
        long end = System.currentTimeMillis();
        System.out.println("一共消耗"+ (end-start)+ "毫秒");  //0毫秒
    }


    //高效字节流一次读写一个字节
    @Test
    public void Test33() throws IOException {

        long start = System.currentTimeMillis();

        BufferedInputStream fis = new BufferedInputStream(new FileInputStream("1.html"));
        BufferedOutputStream fos = new BufferedOutputStream(new FileOutputStream("11.html"));

        int by = 0;
        while ((by = fis.read()) != -1){
            fos.write(by);
        }
        long end = System.currentTimeMillis();
        System.out.println("一共消耗"+ (end-start)+ "毫秒"); //2毫秒
    }



    //基本字节流一次读写一个字节
    @Test
    public void Test1() throws IOException {

        long start = System.currentTimeMillis();

        FileInputStream fis = new FileInputStream("1.html");
        FileOutputStream fos = new FileOutputStream("11.html");

        int by = 0;
        while ((by = fis.read()) != -1){
            fos.write(by);
        }
        long end = System.currentTimeMillis();
        System.out.println("一共消耗"+ (end-start)+ "毫秒");  //76毫秒
    }


    //基本字节流一次读写一个字节数组
    @Test
    public void Test2() throws IOException {

        long start = System.currentTimeMillis();

        FileInputStream fis = new FileInputStream("1.html");
        FileOutputStream fos = new FileOutputStream("11.html");

        byte[] chars = new byte[1024];
        int len = 0;
        while ((len = fis.read(chars)) != -1){
            fos.write(chars);
        }
        long end = System.currentTimeMillis();
        System.out.println("一共消耗"+ (end-start)+ "毫秒");
    }




}
