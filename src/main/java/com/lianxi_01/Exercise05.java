package com.lianxi_01;

import java.util.Scanner;

/**
 * @author wq
 * @since 2021-10-14 11:47
 */

public class Exercise05 {
    public static void main(String[] args) {
        int day;

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入月份：");
        int s = sc.nextInt();
        for (int i = 1; i <= 12; i++) {
            switch (s) {
                case 1:
                    //System.out.println("大月");
                case 3:
                    //System.out.println("大月");
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    day = 31;
                    System.out.println("大月");
                    break;

                case 4:
                case 6:
                case 9:
                case 11:
                    day=30;
                    System.out.println("小月");
                    break;

                default:
                    break;
            }
        }
        System.out.println(s);
    }
}