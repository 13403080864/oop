package com.io.readerAndWriter;

import java.io.FileReader;

/**
 * @author wq
 * @since 2022-05-15 上午11:15
 */

public class FileReaderDemo2 {
    /**
     *
     * 字符输入流读取歩鄹： 一次读一个数组，效率高，常用
     *  1. 创建字符输入流对象
     *  2. 调用读取功能，并显示
     *  3. 释放资源
     */

    public static void main(String[] args) throws Exception {
        //1. 创建字符输入流对象
        FileReader fr = new FileReader("a.txt");

        //一般用法
        //2. 调用读取功能，并显示
        char[] chs = new char[1024]; //读取数组，所以先新建数组
        int len = 0;
        while ((len =fr.read(chs)) != -1){
            //chs是字符，转化为字符串，直接新建一个字符串,传入 0,len  是直接读到文本的长度，防止有空的字符
            System.out.print(new String(chs ,0,len));
        }

        //3. 释放资源
        fr.close();
    }
}
