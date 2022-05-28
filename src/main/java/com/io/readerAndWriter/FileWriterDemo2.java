package com.io.readerAndWriter;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author wq
 * @since 2022-05-15 下午1:22
 *
 * 字符输出流，写入数据，5种方式：
 *
 *      1,一次写一个字符
 *      2,一个写一个字符数组
 *      3,一次写一个数组的一部分
 *      4,一次写一个字符串 [常用]
 *      5,一次写一个字符串的一部分
 *
 *  追加写入数据
 *
 */

public class FileWriterDemo2 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("aa.txt");
        //fw.write('a'); //1,一次写一个字符

        //char[] ch = {'a','b','c'}; //2,一个写一个字符数组
        //fw.write(ch);

        //char[] ch = {'a','b','c','d'};
        //fw.write(ch,0,2); //3,一次写一个数组的一部分

        //fw.write("String"); //4,一次写一个字符串 [常用]

        fw.write("String",2,4); //5,一次写一个字符串的一部分
        fw.flush();  //刷新到文本


        FileWriter fw2= new FileWriter("aaa.txt",true); //增加写入,第二次运行的时候就是追加
        fw2.write("hello\t\n");
        fw2.write("word\t\n");
        fw2.flush();
    }
}
