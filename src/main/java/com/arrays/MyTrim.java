package com.arrays;

/**
 * @author wq
 * @since 2021-09-17 14:40
 */

public class MyTrim {
    public static void main(String[] args) {
        String str = " i am    ";
        String trim = trim(str);
        //String trim2 = trim2(str);
        System.out.println(trim); //i am
    }

    public static String trim2(String str){
        String trim = str.trim();
        return trim;
    }
    //去空格
    public static String trim(String str){
        String replaceFirst = str.replaceFirst(" +", "");
        while (str.endsWith(" ")){
            //截取字符串substring
            str = str.substring(0, str.length() - 1);
        }
        return str;
    }
}
