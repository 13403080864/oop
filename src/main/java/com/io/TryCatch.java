package com.io;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author wq
 * @since 2021-10-09 11:22
 * try{
 *      可能会产生异常代码
 * }Catch(异常类变量 变量名){
 *      异常处理逻辑
 * }finally{
 *      一定会执行的代码
 *      释放资源
 * }
 */

public class TryCatch {
    public static void main(String[] args) {
        //定义变量的时候可以不用给值，但是使用的时候必须给值，finally中用了fw，所以必须定义的时候给初始化的值；
        //fw = new FileWriter("d:\\c.txt"); 执行失败的话，fw就为空了，释放资源就会报错，所以释放资源判断下
        FileWriter fw = null;
        try {
            fw = new FileWriter("c.txt");
            //写入单个字符
//            fw.write('a');
//            //写多个字符
            char[] chars = {'2','c','d'};
            fw.write(chars,0,chars.length);
            System.out.println(new String(chars));
        } catch (IOException e) {
            //异常处理逻辑
            //e.printStackTrace();
            System.out.println(e);
        }finally {
            //fw必须在外面先定义
            //fw.close()方法声明抛出了IOException异常，外面要么throws,要么try catch
            //此处做判断，非空判断,就不会报空指针异常的错误了
            if(fw!=null){
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
