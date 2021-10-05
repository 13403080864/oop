package com.collection;


import java.util.ArrayList;

/**
 * @author wq
 * @since 2021-09-23 9:28
 */

public class Collection {
    public static void main(String[] args) {
        //集合类是抽象的接口，实例需要用ArrayList
        //1.集合添加功能
        //Collection c = new Collection();
        ArrayList c2 = new ArrayList();
        c2.add("hello");
        c2.add("world");
        c2.add("java");
        System.out.println(c2); //[hello, world, java]

        //2.集合删除功能
        c2.remove("hello");
        System.out.println(c2); //[world, java]

        //3.获取长度
        int size = c2.size();
        System.out.println(size); //2

        //4.判断功能
        //4.1判断集合是否为空
        boolean empty = c2.isEmpty();  //false
        System.out.println(empty);
        //4.2判断是否包含某个元素
        boolean contains = c2.contains("java");
        System.out.println(contains);  //true

    }
}
