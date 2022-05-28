package com.day06;

/**
 * @author wq
 * @since 2022-05-26 下午9:30
 * 输出格式：
 *      姓名：Tom,年龄：20岁
 */

public class Demo2String {
    public static void main(String[] args) {
        String str = "Tom:20|Jack:22|Rose:24";
        String[] split = str.split("\\|");

        for (int i = 0; i < split.length; i++) {
            String[] split1 = split[i].split(":");
            System.out.println("姓名: "+split1[0]+"," + " 年龄: "+split1[1]);
        }
    }
}

