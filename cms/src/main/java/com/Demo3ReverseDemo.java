package com;

/**
 * @author wq
 * @since 2022-05-26 下午10:32
 */

public class Demo3ReverseDemo {
    public static void main(String[] args) {
        String s = "abcdefg";
        reverse(s);
    }

    public static void reverse(String s) {

        char[] chars = new char[s.length()];
        for (int i = s.length() - 1; i >= 0; i--) {
            chars[s.length() - i - 1] = s.charAt(i);
        }

        System.out.println(new String(chars));
    }
}
