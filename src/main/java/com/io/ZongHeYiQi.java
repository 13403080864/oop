package com.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * @author daixiongxing
 * @since 2021-12-16 下午10:04
 */

public class ZongHeYiQi {
    public static void main(String[] args) {

        //readFromFile(new File("/Users/daixiongxing/Desktop/a.txt"));
        //writeToFile();
        writeToFile2();
    }

    //使用FileInputStream、InputStreamReader、BufferedReader从磁盘文件中读取内容
    public  static void readFromFile(File file) {
        if (file.isFile() && file.exists()) {
            try {

                //FileInputStream用于从文件读取数据,读取文件成字节流
                FileInputStream fs = new FileInputStream(file);

                //使用InputStream从文件里读取数据，将字节流转换为字符流.
                InputStreamReader isr = new InputStreamReader(fs);

                //从字符输入流中读取文本，缓冲各个字符
                BufferedReader br = new BufferedReader(isr);

                StringBuffer sb = new StringBuffer();
                String text = null;
                while ((text = br.readLine()) != null) {
                    //将读取到的文本存入stringbuffer中
                    sb.append(text);
                }
                System.out.println("读取结果：" + sb.toString());

            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }

    }


    //使用FileWriter和BufferedWriter写入字符串到磁盘中
    public static void writeToFile() {
        String content = "测试写入文件";
        File file = new File("/Users/daixiongxing/Desktop/a.txt");
        try {
            //创建字符输出流类对象和已存在的文件相关联;文件不存在的话，并创建;true表示从结尾续写，false表示覆盖重写
            FileWriter fw = new FileWriter(file,false);
            BufferedWriter bw = new BufferedWriter(fw);
            //写入字符串内容
            bw.write(content);
            //关闭流
            bw.close();
            fw.close();
            System.out.println("测试写入成功");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


    //使用FileOutputStream 和 OutputStreamWriter写入文件
    public static void writeToFile2() {
        String content = "测试写入文件2";
        File file = new File("/Users/daixiongxing/Desktop/a.txt");
        try {
            //字节输入流
            FileOutputStream fs = new FileOutputStream(file);
            //将字节流转换为字符流
            OutputStreamWriter os = new OutputStreamWriter(fs);
            os.write(content);
            os.close();
            fs.close();
            System.out.println("成功写入文件2");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


}