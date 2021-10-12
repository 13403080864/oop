package com.lianxi_01;

/**
 * @author wq
 * @since 2021-10-12 16:12
 */

public class Exercise01 {
    public static void main(String[] args) {
        System.out.println("第1个月的兔子对数:    1");
        System.out.println("第2个月的兔子对数:    1");
        int f1 = 1, f2 = 1, f, M=12;
    for(int i=3; i<=M; i++) {
    f = f2;
    f2 = f1 + f2;
    f1 = f;
    System.out.println("第" + i +"个月的兔子对数: "+f2);
     }
        }
}
