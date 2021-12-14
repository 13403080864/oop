package com.io;

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

/**
 * @author
 * @since 2021-10-10 上午9:10
 *
 * java.io.BufferedWriter extends Writer
 * BufferedWrite 字符缓冲输出流
 *
 * 继承来自父类的共性成员方法：
 *      public void close() 关闭资源
 *      public void flush() 刷新刺输出流并强势任何缓冲流的输出字节被写出
 *
 *      public void write(int c)  写入单个字符
 *      public void write(char[] ch) 写入字符数组
 *      public void write(char[] ch,int off,int len) 写入字符一部分，off索引开始，len 是写的字符个数
 *      public void write(String str)  写入字符串
 *
      1，创建 FileWriter对象，构造方法中绑定要输出的目的地
      2，创建 BufferedWriter对象，构造方法中传递FileWriter对象，提高FileWriter对象效率

          第一二步可合并一步
      3，调用BufferedWriter的方法write,把数据写入缓冲区
      4，使用BufferedWriter的flush,把缓冲区的数据刷新到文件中
      5，释放资源（释放资源会先调用flush 所以第四部可省略）
 */

public class DemoBufferedWriter {

    public static void main(String[] args) throws IOException {

            //1,创建字符输出流对象，构造方法中传递字符输出流

            BufferedWriter bw = new BufferedWriter(new FileWriter("c.txt"));

            //2,调用BufferedWriter的方法write,把数据写入缓冲区

        for (int i = 0; i < 5; i++) {

            bw.write("学习最重要");
            //换行下
            bw.newLine();

        }
        bw.close();

    }
}
