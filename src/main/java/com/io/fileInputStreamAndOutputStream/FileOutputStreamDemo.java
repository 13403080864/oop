package com.io.fileInputStreamAndOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author wq
 * @since 2022-05-15 下午6:23
 */

public class FileOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        /**
         * 字节输出流写入数据 ：3个方法
         *  1，写入一个字符
         *  2，写入一个字符数组
         *  3，写入一个字符数组的一部分
         */

        //创建字节的输出流对象
        FileOutputStream fos = new FileOutputStream("abc.txt");
        //写入数据
        //fos.write(97);  写入一个字符

        byte[] chs = {'a',98,99};
        fos.write(chs);
        fos.flush();
        fos.close();
    }
}
