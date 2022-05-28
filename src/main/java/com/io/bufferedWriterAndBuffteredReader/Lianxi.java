package com.io.bufferedWriterAndBuffteredReader;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author wq
 * @since 2022-05-17 下午9:12
 */

public class Lianxi {

    public static void main(String[] args) throws IOException {
        //test1();
        test2();
    }

    public static void test1() throws IOException {

        //ArrayList有三个字符串元素，把三个元素写入文本文件中，并加入换行
        //换行 可以用nextLine
        ArrayList<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("world");
        list.add("java");

        BufferedWriter writer = new BufferedWriter(new FileWriter("aa.txt"));

        for (String sc : list) {

            writer.write(sc);
            writer.flush();
            writer.newLine();
        }

        writer.close();

    }



    public static void test2() throws IOException {

        //把文本文件的读取到list中
        BufferedReader br = new BufferedReader(new FileReader("aa.txt"));
        ArrayList<String> list = new ArrayList<>();
        String str = null;
        while ((str = br.readLine()) != null){
            list.add(str);
        }
        System.out.println(list); //数组一样直接取出
        br.close();

//        for ( String s : list) {
//              System.out.println(s);  一个个取出
//        }
    }
}
