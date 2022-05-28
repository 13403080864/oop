package com.io.fileInputStreamAndOutputStream;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author wq
 * @since 2022-05-15 下午6:23
 *
 * 字节输入流歩鄹：
 *  创建字节输入流对象
 *  调用读取数据防范，并显示
 *  释放资源
 */

public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {

        //一次读取一个字节,是不能有中文的，这个读取一般用字符
      //创建字节的输入流对象
        FileInputStream fis = new FileInputStream("abc.txt");
        //读取数据
        int len = 0;
        while ((len = fis.read()) != -1){
            System.out.print((char) len);
        }
        //释放资源
        fis.close();
    }
}
