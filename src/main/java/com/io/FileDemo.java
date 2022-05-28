package com.io;

import java.io.File;
import java.io.IOException;

/**
 * @author
 * @since 2021-10-05 下午9:30
 *
 * 创建功能:
 *  创建文件  public boolean creatNewFile()
 *           如果创建的文件不存在，就创建，存在就不创建
 *
 *  创建文件夹 public boolean mkdir() 创建指定的目录，如果存在就不创建
 *            public boolean mkdirs() 创建文件夹，若父目录不存在，也会创建
 */

public class FileDemo {

    public static void main(String[] args) throws IOException {
        //创建文件in
        File file = new File("in.txt");
        File file1 = new File("out.txt");


        //绝对路径创建文件
        File file2 = new File("d:\\abcd");
        System.out.println(file2);

        boolean newFile = file1.createNewFile();
        //创建文件夹mkdir（创建一个文件夹） mkdirs(创建多个文件夹)
        File f = new File("cc\\ddcccc");
        boolean mkdir = f.mkdirs();
        System.out.println(newFile);
        System.out.println(mkdir);
    }
}
