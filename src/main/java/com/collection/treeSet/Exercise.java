package com.collection.treeSet;

import java.util.Set;
import java.util.TreeMap;

/**
 * @author
 * @since 2021-09-30 下午3:42
 *
 * 统计字符出现次数
 */

public class Exercise {

    public static void main(String[] args) {

        //定义字符串
        String s = "ahkkuhagnm";

        //字符串转换字符数组

        char[] chars = s.toCharArray();

        TreeMap<Character,Integer> tm = new TreeMap<Character,Integer>();

        for(Character cha : chars){

            Integer i = tm.get(cha);

            if(i == null){

                tm.put(cha,1);

            }else {

                i++;

                tm.put(cha,i);
            }
        }

        //System.out.println(tm); //{a=2, g=1, h=2, k=2, m=1, n=1, u=1}

        //把TreeMap的数据拼接成一个字符串

        StringBuilder sb = new StringBuilder();

        //遍历map集合
        Set<Character> set = tm.keySet();

        for(Character c : set){

            Integer i = tm.get(c);

            StringBuilder append = sb.append(c).append("(").append(i).append(")");

        }

         String result = sb.toString();
        System.out.println(result);
    }
}
