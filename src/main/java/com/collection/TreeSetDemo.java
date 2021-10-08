package com.collection;

import java.util.TreeSet;

/**
 * @author wq
 * @since 2021-09-24 16:08
 * TreeSet 按照自然排序，a-z，元素唯一性
 */

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> th = new TreeSet<String>();
        th.add("hello");
        th.add("world");
        th.add("abc");
        th.add("drt");
        //循环  （迭代器，增强for）
        for(String s : th){
            System.out.println(s);
        }
    }
}
