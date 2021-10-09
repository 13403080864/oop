package com.io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author wq
 * @since 2021-10-09 15:52
   java.io.BufferedOutputStream extends OutputStream
 * java.io.BufferedOutputStream 字节缓冲输出流
 * 继承来自父类的共性成员方法：
 *      public void close() 关闭资源
 *      public void flush() 刷新刺输出流并强势任何缓冲流的输出字节被写出
 *      public void write(byte[] b) 将b.length字节从指定字节数组写入此输出流
 *      public void write(byte[] b,int off,int len)
 *      public abstract void(int b)
 *  构造方法：
 *      BufferedOutputStream(OutputStream out) 创建一个新的缓冲输出流，以将数据写入指定的底层输出流
 *      BufferedOutputStream(OutputStream out，int size) 创建一个新的缓冲输出流，以将具体数据缓冲大小的写入
 *
 *  使用步骤：
 *      1，创建 FileOutputStream对象，构造方法中绑定要输出的目的地
 *      2，创建 BufferedOutputStream对象，构造方法中传递FileOutputStream对象，提高FileOutputStream对象效率
 *      3，调用BufferedOutputStream的方法write,把数据写入缓冲区
 *      4，使用BufferedOutputStream的flush,把缓冲区的数据刷新到文件中
 *      5，释放资源（释放资源会先调用flush 所以第四部可省略）
 */

public class DemoBufferedOutputStream {
    public static void main(String[] args) throws IOException {
        //1，创建 FileOutputStream对象，构造方法中绑定要输出的目的地
        FileOutputStream fos = new FileOutputStream("d.txt");

        //2，创建 BufferedOutputStream对象，构造方法中传递FileOutputStream对象，提高FileOutputStream对象效率
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        //3，调用BufferedOutputStream的方法write,把数据写入缓冲区
        bos.write("我把数据写入缓冲区中".getBytes());
        bos.close();
    }
}
