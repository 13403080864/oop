package com.day06;

/**
 * @author wq
 * @since 2022-05-26 下午10:32
 */

public class Demo3Reverse {
    public static void main(String[] args) {
        String s = "abcdefg";
        reverse(s);
    }

    public static void reverse(String s) {

        String str = new String(s);
        for (int i = s.length() - 1; i >= 0; i--) {

            System.out.print(s.charAt(i));
        }

    }
}
