package com.io.bufferedWriterAndBuffteredReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author wq
 * @since 2022-05-15 下午8:23
 */

public class BufferedReaderDemo {
    public static void main(String[] args) throws IOException {
        //创建字符流,并传入缓冲流
        //FileReader fr = new FileReader("a.txt");
       // BufferedReader br = new BufferedReader(fr);

        //合并
        BufferedReader br = new BufferedReader(new FileReader("a.txt"));

        //读取文件。两种方式
        //1,一次读取一个字符
//        int ch = 0;
//        while ((ch = br.read()) != -1){
//            System.out.print((char) ch);
//        }

        //2,一次读取一个数组字符
        //先新建一个数组
        char[] chars = new char[1024];
        int len = 0;
        while ((len = br.read(chars)) != -1){
            System.out.print(new String(chars,0,len));
        }

    }

}
