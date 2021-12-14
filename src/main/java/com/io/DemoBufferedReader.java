package com.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author
 * @since 2021-10-10 上午9:27
 *
 * BufferedReader 字符缓冲输入流
 */

public class DemoBufferedReader {

    public static void main(String[] args) throws IOException {

        //BufferedReader br = new BufferedReader(new FileReader("c.txt"));
        BufferedReader b1= new BufferedReader(new FileReader("a.txt"));

        //read 方法
//        char[] ch = new char[1024];
//
//        int len = 0;
//
//        while ((len = br.read(ch)) !=-1){
//
//            System.out.println(len);
//
//            System.out.println(new String(ch));

//        }



        //readLine()方法

        String line;

        while ((line = b1.readLine()) !=null){

            System.out.println(line);

        }
    }
}
