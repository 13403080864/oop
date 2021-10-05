package com.data;

import java.util.Calendar;
import java.util.Scanner;

/**
 * @author wq
 * @since 2021-09-22 14:03
 */

public class Calendar1 {
    public static void main(String[] args) {
        Calendar calendar2 = Calendar.getInstance();
        System.out.println("请输入年份：");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        calendar2.set(year,2,1);
        calendar2.add(Calendar.DATE,-1);
        System.out.println("该年2月份天数为：" + calendar2.get(Calendar.DATE));

    }
}
