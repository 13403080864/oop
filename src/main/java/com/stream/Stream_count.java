package com.stream;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * @author wq
 * @since 2021-10-11 16:14
 * Stream常用方法 count,统计流中元素个数
 * count 第一个终结方法，返回的是long类型的整数
 * 所以不能在继续调用Stream的其他方法
 *
 * limit 截取几个元素
 * skip 跳过，获取截取之后的元素
 */

public class Stream_count {
    public static void main(String[] args) {
        //Stream流创建的另一种方式，单列集合
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        //把集合转换为Stream流
        Stream<Integer> stream = list.stream();
        //统计个数
        long count = stream.count();
        System.out.println(count);
    }
}
