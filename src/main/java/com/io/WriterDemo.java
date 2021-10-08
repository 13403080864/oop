package com.io;

import java.awt.*;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author wq
 * @since 2021-10-08 16:25
 * flush() 与 close() 区别
 * flush() 把内存缓冲区的数据，刷新到文件中 流可以继续使用
 * close() 使用后.流被关闭了，不能使用
 */

public class WriterDemo {
    public static void main(String[] args) throws IOException {
        //创建对象,指定写入的文件中
       FileWriter fw = new FileWriter("b.txt");
       //一次写入一个字符
       fw.write(98);
       fw.write(78);
       //把内存缓冲区的数据，刷新到文件中
       fw.flush();
        fw.write(68);

        //一次写多个字符 void write(char[] cbuf)
        //写入数组的一部分 void write(char[] cbuf,int offset,int len)
        //先定义一个字符数组
        char[] ch = {'a','b','c','1'};
        fw.write(ch);
        fw.write(ch,1,3);//索引1开始，后面写入3个字符
        //直接写入字符串
        fw.write("hello嗨"); //hello嗨 这是单独运行字符串的时候
       fw.close();
    }
}
