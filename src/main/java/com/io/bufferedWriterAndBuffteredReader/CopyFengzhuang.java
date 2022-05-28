package com.io.bufferedWriterAndBuffteredReader;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author wq
 * @since 2022-05-16 下午9:11
 */

public class CopyFengzhuang {
    //封装复制文件方法

    /**
     *
     * @param read 读取的文件，数据源
     * @param write 往里写的文件，目的地
     * @throws IOException
     */
    public void copyFile(String read,String write) throws IOException {
        //创建读取的数据源
        FileReader fr = new FileReader(read);

        //创建目的地
        FileWriter fw = new FileWriter(write);
        //读取，一次读取一个字符数组
        //首先创建数组
        char[] chars = new char[1024];
        int len = 0;
        while ((len = fr.read(chars)) != -1){

            //读一个写入一个
            fw.write(chars,0,len);
            //刷新，是为了写入目的地
            fw.flush();
        }

        fw.close();
        fr.close();
    }


    public void copyImage(String readName,String writeName) throws IOException {

        //封装输入的图片
        FileInputStream fis = new FileInputStream(readName);

        //创建目的地
        FileOutputStream fos = new FileOutputStream(writeName);
        //读取，一次读取一个字符数组
        //首先创建数组
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = fis.read(bytes)) != -1){

            //读一个写入一个
            fos.write(bytes,0,len);
            //字节流可以不刷
            //fos.flush();
        }

        fos.close();
        fis.close();

    }
}
