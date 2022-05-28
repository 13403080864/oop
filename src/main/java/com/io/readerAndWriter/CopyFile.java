package com.io.readerAndWriter;

import java.io.FileReader;
import java.io.FileWriter;

/**
 * @author wq
 * @since 2022-05-15 下午4:29
 */

public class CopyFile {

    public static void main(String[] args) throws Exception {
        //封装数据源，即使读取的文本
        FileReader fr = new FileReader("a.txt");

        //封装目的地
        FileWriter fw = new FileWriter("b.txt");

        //读取
        int ch = 0;
        while ((ch = fr.read()) != -1){
            fw.write(ch);
            fw.flush();
        }

        //释放资源
        fw.close();
        fr.close();
    }
}
