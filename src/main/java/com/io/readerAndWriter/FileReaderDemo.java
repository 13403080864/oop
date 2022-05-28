package com.io.readerAndWriter;

import java.io.FileReader;

/**
 * @author wq
 * @since 2022-05-15 上午11:15
 */

public class FileReaderDemo {
    /**
     *
     * 字符输入流读取歩鄹： 一次读一个字符，效率不高
     *  1. 创建字符输入流对象
     *  2. 调用读取功能，并显示
     *  3. 释放资源
     */

    public static void main(String[] args) throws Exception {
        //1. 创建字符输入流对象
        FileReader fr = new FileReader("a.txt");

        //2. 调用读取功能，并显示
        //public int read() 这种用的少
        //读取每一次读取一个字节，所以需要判断读完了就不在读了
        //int ch = fr.read();
        //while (ch != -1){
            //System.out.print(ch); //直接打印打印是数字，所以需要转换为字符
            //System.out.print((char)ch);
            //这里需要再继续读取，否则一直读取的是第一个字
            //ch = fr.read();
        //}



        //一般用法
        int ch = 0;
        while ((ch=fr.read()) != -1){
            System.out.print((char) ch);
        }

        //3. 释放资源
        fr.close();
    }
}
