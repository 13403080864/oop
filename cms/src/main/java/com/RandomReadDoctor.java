package com;

import java.util.Random;

/**
 * @author wq
 * @since 2022-05-23 下午8:50
 */

public class RandomReadDoctor {

    private static final String[] Surname = new String[]{"你好","可以的","现在过来可以吗？","明天休息","好",

    "嗯嗯","知道了","可以的","oo","好的，下午可以的","稍等，现在有个患者","拜拜"};

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
