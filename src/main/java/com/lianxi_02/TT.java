package com.lianxi_02;

import java.util.Random;

/**
 * @author daixiongxing
 * @since 2021-12-18 下午12:10
 */

public class TT{
    public static void main(String[] args) {

        Random random = new Random();
        //生成64-128内的随机数
        //int i = random.nextInt() * (128 - 64 + 1) + 64;
        /**
         * 生成 [m,n] 的数字
         * int i1 = random.nextInt() * (n-m+1)+m;
         * */
        //生成0-64内的数字
        int i1 = random.nextInt() * (64-0+1);
        for (int i = 0; i < 5; i++) {
            i =i1;
        }

        System.out.println(i1+"             ");
        /**
         * 生成0-n之内的数字
         * int i1 = random.nextInt() * (n-0+1);
         *
         *
         * */


    }
}