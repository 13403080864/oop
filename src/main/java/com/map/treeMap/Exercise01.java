package com.map.treeMap;

import java.util.TreeMap;

/**
 * @author wq
 * @since 2021-09-29 14:44
 * 统计字符出现次数
 *  1.将字符串转换为字符数组
 *  2.遍历数组存入map（TreeMap是可以有顺序的）集合，统计次数，Character做键，Integer做值
 *  3.遍历字符数组，获取每一个字符
 *  4.拿到字符到集合中中对应的值
 *  5.判断字符返回值是否为null
 *      是，存储，把次数记录为 1
 *      否，把数据 ++ ，然后存储（重写原来的）
 *  6.把TreeMap的数据拼接成字符串数组
 */

public class Exercise01 {
    public static void main(String[] args) {
        //定义字符串
        String s = "afdnfafajfla";
        //将字符串转换为字符数组
        char[] chars = s.toCharArray();
        //遍历数组
        //定义一个TreeMap集合
        TreeMap<Character,Integer> tm = new TreeMap<Character,Integer>();
        for(Character cha :chars){
            //获取每一个字符，存入集合
            Integer i = tm.get(cha);
           // System.out.println(ca);
            //判断集合中是否有改字符，没有的话，存储，记录为 1,即返回值
            if(i ==null){
                //没有的话，记录 1
                tm.put(cha,1);
            }else {
                //有的话
                i++;
                tm.put(cha,i);
            }
        }
        System.out.println(tm);
    }
}
