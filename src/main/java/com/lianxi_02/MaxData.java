package com.lianxi_02;

/**
 * @author wq
 * @since 2021-12-10 14:44
 */

public class MaxData {
    public static void main(String[] args) {
        //数字转换为字符串
        int a = 10;
        String s1 = String.valueOf(a);

        String s2 = a +"";
        //String s2 = 20 +"";
        System.out.println("数字转换为字符串方式一: "+ s1+1); //101
        System.out.println("数字转换为字符串方式二: "+ s2+1); //101

        //字符串转换为数字
        String str = "1001";
        int i1 = Integer.parseInt(str);
        int i2 = i1 + 1;
        System.out.println(i2); //1002

        //字符串比较  a==b返回0，a>b返回正数，a<b返回负数 ;compareToIgnore忽略大小写
        String s3 = "102";
        String s4 = "101";
        System.out.println(s3.compareTo(s4)); //1

        String s5 = "abc";
        String s6 = "Bcd";
        System.out.println(s5.compareToIgnoreCase(s6)); //-1
        System.out.println("========================");

        int arr[] = {30,1};
        String string = String.valueOf(arr);

        System.out.println("");
    }

    }

