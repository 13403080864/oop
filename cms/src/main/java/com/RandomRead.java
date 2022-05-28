package com;

import java.util.Random;

/**
 * @author wq
 * @since 2022-05-23 下午8:50
 */

public class RandomRead {

    private static final String[] Surname = new String[]{"你好","请问什么时候下班","现在过来可以吗？","吃完饭就过来","好",

    "嗯嗯","知道了","谢谢","oo","好的，谢谢医生","第一次咨询的","拜拜"};

    public static void main(String[] args) {

        String string = getString();
        System.out.println(string);


    }

    public static String getString(){

        Random random = new Random();
        int i = random.nextInt(Surname.length);
        String s = Surname[i];
        return s;
    }

}
