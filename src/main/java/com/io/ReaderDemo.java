package com.io;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author wq
 * @since 2021-10-08 10:30
 *
 * java.io.Reader:字符输入流，是字符输入流的最顶层的父类，定义一些共性的方法，是抽象类
 * 共性成员方法：
 *      int reader() 读取单个字符并返回
 *      int reader(char[] cbuf) 一次读取多个字符，并将字符读入数组
 *      void close() 关闭资源
 *  java.io.FileReader extends InputStreamReader extends Reader
 *  FileReader:文件字符输入流
 *  作用：把硬盘文件的数据以字符方式读取内存中
 *  构造方法：
 *      FileReader(String fileName)
 *      FileReader(File file)
 *  参数：读取文件的数据源
 *      String fileName 文件路径
 *      File file 一个文件
 *  FileReader的方法构造作用：
 *      1，创建一个FileReader对象
 *      2，会把FileReader对象指向要读取的文件
 */
/**
 * 字符输入流使用步骤：
 *      1，创建FileReader对象，构造方法中绑定要读取的数据源
 *      2，使用FileReader对象的方法read读取文件
 *      3，释放资源
 */

public class ReaderDemo {
    public static void main(String[] args) throws IOException {
        //1,创建FileReader对象，构造方法中绑定要读取的数据源
        FileReader fr = new FileReader("a.txt");
        //2，使用FileReader对象的方法read读取文件;一次读取一个字符
//        int len = 0;
//        while ((len= fr.read()) !=-1){
//            System.out.print((char) len); //你好hello123
//        }

//        boolean newFile = file.createNewFile();
//        System.out.println(newFile);

        //int reader(char[] cbuf) 一次读取多个字符，并将字符读入数组
        //读取多个字符,读取数组
        char[] ch = new char[1024];  //存储读取到的多个字符
        int len = 0;  //记录每次读取的个数
        while ((len = fr.read(ch)) !=-1){
            System.out.println(len);  //10 记录是个数

            /** 需要转换为字符串
             * String类的构造方法
             *  String(char[] value) 把字符数组转换为字符串
             *  String(char[] value，int offset，count) 把字符数组一部分转换为字符串，offset开始索引，count个数
             */
            System.out.println(new String(ch));
            System.out.println(new String(ch,0,len)); //你好hello123
            //System.out.println(new String(ch,0,len)); 这个也可以
            System.out.println(new String(ch,0,len-1));  //你好hello12
        }
        //释放资源
        fr.close();
    }


}
