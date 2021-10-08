package com.io;

/**
 * @author wq
 * @since 2021-10-08 17:34
 */

public class CharToString {
    public static void main(String[] args) {
        char c ='a';
        //字符转换为字符串
        String ss3 = Character.toString(c);
        System.out.println(ss3 + 1);

        String ss = "str";
        System.out.println(ss + 1);

        //字符数组转换为字符串
        char[] ch = {'a','b','c','d'};
        //字符转换为字符串 1
        String s = new String(ch);
        System.out.println(s);

        String s1 = String.valueOf(ch);
        System.out.println(s1);

    }
}
