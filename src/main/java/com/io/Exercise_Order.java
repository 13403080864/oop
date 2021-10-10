package com.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

/**
 * @author
 * @since 2021-10-10 上午10:42
 *
 * 练习：
 *      对文本内容排序
 *      按照（123.。。）排序
 * 分析：
 *      1，创建一个HashMap 集合对象，可以：存储每行文本的序号（1，2，3）；value 存储每行的文本
 *      2，创建字符缓冲输入流对象，构造方法中绑定字符输入流
 *      3，创建字符缓冲输出流对象，构造方法中绑定字符输出流
 *      4，使用字符缓冲输入流中的readLine方法，读取文本
 *      5，对读取的文本进行切割，获取行中的序号和文本内容
 *      6，把切割好的序号和文本内容存储到HashMap集合中（key 是序号，会自动排序）;注意：这里会有排序是因为数组长度在默认以内16，超过则不行的
 *      7，遍历HashMap，获取每一个键值对
 *      8，把每一个键值对，拼接为每一个文本行
 *      9，把拼接好的文本，使用字符缓冲输出流write 写入文件中
 *      10，释放资源
 *
 */

public class Exercise_Order {

    public static void main(String[] args) throws IOException {

        //1,创建一个HashMap 集合对象
        HashMap<Integer,String> hm = new HashMap<>();

        //2,创建字符缓冲输入流对象，构造方法中绑定字符输入流
        BufferedReader br = new BufferedReader(new FileReader("in.txt"));

        //3,创建字符缓冲输出流对象，构造方法中绑定字符输出流
        BufferedWriter bw = new BufferedWriter(new FileWriter("out.txt"));

        //4,使用字符缓冲输入流中的readLine方法，读取文本
        String line ;
        while ((line = br.readLine()) !=null){

            //5,对读取的文本进行切割，获取行中的序号和文本内容
            String[] arr = line.split("\\.");

            //6,把切割好的序号和文本内容存储到HashMap集合中（key 是序号，会自动排序,）
            hm.put(Integer.valueOf(arr[0]) ,arr[1]);
        }

        //7,遍历HashMap，获取每一个键值对
        for (Integer key :hm.keySet()){
            //根据key获取值
            String s = hm.get(key);

            //8,把每一个键值对，拼接为每一个文本行
            line = key + "." + s;

            //9,把拼接好的文本，使用字符缓冲输出流write 写入文件中
            bw.write(line);
            bw.newLine();
        }
        //10,关闭资源
        bw.close();
        br.close();
    }
}
