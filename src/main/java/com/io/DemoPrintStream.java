package com.io;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * @author wq
 * @since 2021-10-11 14:00
 * PrintStream 打印流
 *  setOut方法可以改变输出流的目的地
 */

public class DemoPrintStream {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("控制台输出");
        PrintStream ps = new PrintStream("a.txt");
        System.setOut(ps);
        System.out.println("文件中输出");
    }
}
