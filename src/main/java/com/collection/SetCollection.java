package com.collection;

import java.util.HashSet;
import java.util.Set;

/**
 * @author wq
 * @since 2021-09-24 14:26
 * 无序，唯一
 */

public class SetCollection {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("hello");
        set.add("world");
        set.add("hello");
        set.add("java");
        System.out.println(set);  //[world, java, hello]

        //遍历方式一：迭代器
//        Iterator<String> iterator = set.iterator();
////        while (iterator.hasNext()){
////            System.out.println(iterator.next());
////        }

        //遍历方式一：增强for
        for (String s : set){
            System.out.println(s);
        }

    }
}
