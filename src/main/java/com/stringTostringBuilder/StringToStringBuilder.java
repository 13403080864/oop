package com.stringTostringBuilder;

/**
 * @author
 * @since 2021-10-18 下午8:25
 */

public class StringToStringBuilder {

    public static void main(String[] args) {

        StringTStringBuilder();
        StringBuilderTString();

        //System 类的打印当前毫秒值
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println(currentTimeMillis);
    }

    public static void StringTStringBuilder(){

        //String转换为StringBuilder,直接用构造方法
        StringBuilder builder = new StringBuilder("hello");
        System.out.println(builder);

        //用builder的方法append
        StringBuilder builder1 = new StringBuilder();
        StringBuilder world = builder1.append("world");
        System.out.println(world );
    }

    public static void StringBuilderTString(){

        //StringBuilder转换为 String
        //直接用构造方法
        StringBuilder builder = new StringBuilder("abc");
        String s = builder.toString();
        System.out.println(s + 1); //abc1

        // toString
        builder.append("aaa");
        String s1 = builder.toString();
        System.out.println(s1 + 1); //abcaaa1
    }
}
