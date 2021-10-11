package com.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author wq
 * @since 2021-10-09 16:05
 * java.io.BufferedInputStream extends InputStream
 *     java.io.BufferedInputStream 字节缓冲输入流
 * 继承来自父类的共性成员方法：
 *     int read() 从输入流一次读取一个字节
 *     int read(byte[] b) 一次读取多个字节，并将其存储到缓冲区b数组中
 *     void close()
 *
 *  使用步骤：
 *      1，创建 FileInputStream对象，构造方法中绑定要读取的数据源
 *      2，创建 BufferedInputStream对象，构造方法中传递FileInputStream对象，提高FileInputStream对象效率
 *      3，调用BufferedInputStream的方法read,读取文件
 *      4，释放资源
 */

public class DemoBufferedInputStream {
    public static void main(String[] args) throws IOException {
        //1，创建 FileInputStream对象，构造方法中绑定要读取的数据源
        FileInputStream fis = new FileInputStream("d.txt");

        //2，创建 BufferedInputStream对象，构造方法中传递FileInputStream对象，提高FileInputStream对象效率
        BufferedInputStream bis = new BufferedInputStream(fis);
        //3，调用BufferedInputStream的方法read,读取文件
            //读取一个字节
//        int len = 0;
//        while ((len = bis.read()) !=-1){
//            System.out.print(len + "\t"); //230	136	145	230	138	138	 两中文 一个utf8庄文占3个字节
//        }

        //读取多个字节（常用）
        //int read(byte[] b) 一次读取多个字节，并将其存储到缓冲区b数组中
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = bis.read(bytes)) !=-1){
            System.out.println(len); //记录读取个数 6
            System.out.println(new String(bytes)); //打印的中文
        }

    }
}
