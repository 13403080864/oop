package com.arrays;

/**
 * @author wq
 * @since 2021-09-17 14:56
 */

public class Trim {
    public static void main(String[] args) {
        String str = "  i am  ";
        String myTrim = myTrim(str);
        System.out.println(myTrim);
    }
    public static String myTrim(String str){
        return str.trim();
    }
}
