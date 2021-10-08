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

        File file = new File("a.txt");

        boolean newFile = file.createNewFile();

        System.out.println(newFile);
    }
}
