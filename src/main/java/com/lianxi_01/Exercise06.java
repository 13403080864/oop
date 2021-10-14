package com.lianxi_01;

import java.util.Scanner;

/**
 * @author wq
 * @since 2021-10-14 15:30
 * 题目：输入三个整数x,y,z，请把这三个数由小到大输出
 */

public class Exercise06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int i1 = sc.nextInt();
        int i2 = sc.nextInt();
        int x=i;
        int y=i1;
        int z=i2;
        if(x > y){
            int t = x;
            x=y;
            y=t;
        }
        if(x > z){
            int t = x;
            x=z;
            z=t;
        }
        if(y > z){
            int t =y;
            y=z;
            z=t;
        }
        System.out.println("三个数排序为："+ x+ " " +y+ " "+z);

    }
}
