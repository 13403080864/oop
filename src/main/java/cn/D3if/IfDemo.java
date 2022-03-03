package cn.D3if;

import java.util.Scanner;

/**
 * @author wq
 * @since 2022-02-26 下午12:06
 */

public class IfDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入i:");
        int i = scanner.nextInt();

        System.out.println("请输入j:");
        int j = scanner.nextInt();


        if (i > j){
            System.out.println("i > j");
        }else if(i < j){
            System.out.println("i <j");
        }else {
            System.out.println("i = j");
        }
    }
}
