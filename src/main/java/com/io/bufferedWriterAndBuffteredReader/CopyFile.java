package com.io.bufferedWriterAndBuffteredReader;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author wq
 * @since 2022-05-15 下午8:45
 */

public class CopyFile {
    public static void main(String[] args) throws IOException {
        //封装数据源
        BufferedReader br = new BufferedReader(new FileReader("a.txt"));
        //封装目的地
        BufferedWriter bw = new BufferedWriter(new FileWriter("aa.txt"));

        //读取然后写入
        char[] chars = new char[1024];
        int len = 0;
        while ((len = br.read(chars)) != -1){
            bw.write(new String(chars,0,len));
        }
        bw.flush();
        bw.close();
    }
}
