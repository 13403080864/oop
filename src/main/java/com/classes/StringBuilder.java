package com.classes;

public class StringBuilder {
    public static void main(String[] args) {
        builderOther();
        stringBuilderToString();
    }

    //StringBuilder 转为 String
    public static void stringBuilderToString(){
        StringBuilder builder = new StringBuilder();
         builder.append("我是");
        String s = builder.toString();
        System.out.println(s);
    }

    //String 转为 StringBuilder
    public static void stringToStringBuilder(){
        //构造器方法
        //StringBuilder builder = new StringBuilder("adv");
    }
    public static void builderOther(){
        StringBuilder builder = new StringBuilder();
     
        System.out.println(builder);
    }

    private void append(String s) {
    }
}

