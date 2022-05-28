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
 *
 *     //一次读取一个字节数组，效率高
 */

public class FileInputStreamDemo2 {
    public static void main(String[] args) throws IOException {

        //一次读取一个字节数组
      //创建字节的输入流对象
        FileInputStream fis = new FileInputStream("abc.txt");

        //读取数据
        //读取数组，所以先新建数组
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = fis.read(bytes)) != -1){
            System.out.print(new String(bytes,0,len));
        }
        //释放资源
        fis.close();
    }
}
