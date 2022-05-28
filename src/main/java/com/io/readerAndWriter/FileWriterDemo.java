package com.io.readerAndWriter;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author wq
 * @since 2022-05-15 下午1:22
 *
 * 字符输出流读取歩鄹：
 *      *  1. 创建字符输出流对象
 *      *  2. 调用写入功能，并刷新
 *      *  3. 释放资源
 */

public class FileWriterDemo {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            //1. 创建字符输出流对象
            fw = new FileWriter("writer.txt");

            //2. 调用写入功能，并刷新，需要刷新是因为用了的字符流，一次写入一个字节，字符是2个字节
            fw.write("helloword111,你好");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //判断
            if(fw != null){
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
