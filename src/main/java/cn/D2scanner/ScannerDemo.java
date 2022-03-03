package cn.D2scanner;

import java.util.Scanner;

/**
 * @author wq
 * @since 2022-02-26 上午11:45
 */

public class ScannerDemo {
    public static void main(String[] args) {
        //1.创建Scanner对象
        Scanner scanner = new Scanner(System.in);

        //2.读取int类型数据
        System.out.println("请输入数字：");
        int nextInt = scanner.nextInt();

        System.out.println(nextInt);
    }
}
