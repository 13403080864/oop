package com.io.fileInputStreamAndOutputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @author wq
 * @since 2022-05-15 下午7:54
 */

public class CopyImage {
    /**
     * 复制图片是二进制，只能用字节流
     */

    public static void main(String[] args) throws Exception {
        method();
    }

    private static void method() throws Exception {

        //封装数据源
        FileInputStream fis = new FileInputStream("/Users/daixiongxing/d/bo/ssm.jpg");

        //封装目的地
        FileOutputStream fos = new FileOutputStream("ssm.jpg");

        //读取文件，一次读取一个byte数组
        //先新建一个数组
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = fis.read(bytes)) != -1){
            fos.write(bytes);
        }
        //释放资源
        fos.close();
        fis.close();
    }
}
