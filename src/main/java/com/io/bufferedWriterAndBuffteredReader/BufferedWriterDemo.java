package com.io.bufferedWriterAndBuffteredReader;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author wq
 * @since 2022-05-15 下午8:23
 */

public class BufferedWriterDemo {
    public static void main(String[] args) throws IOException {

        /**
         *  BufferedWriter,BufferedReader是为了高效
         *  BufferedWriter（writer out） 接收的是writer对象，又由于writer是抽象类，所以接收的是它的子类 fileWriter
         *  BufferedWriter父类是writer，它写入功能是使用的是writer的写，所以也有五中方法
         */

        //创建fileWriter对象
        FileWriter fw = new FileWriter("a.txt");

        //将fw对象传入缓冲流
        BufferedWriter bw = new BufferedWriter(fw);
        //以上两步可以写一步
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("a.txt"));

        //传入数据，可以传字符，字符数组，字符串，字符数组的一部分，字符串的一部分
        bw.write("StringDemo");
        bw.close();

    }

}
