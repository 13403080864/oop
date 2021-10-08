package com.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * @author wq
 * @since 2021-09-23 12:27
 */

public class ListCollection {
    public static void main(String[] args) {
        List list = new ArrayList();
        //添加功能
        list.add("hello");
        list.add("world");
        list.add("java");
        //在指定索引添加元素
        list.add(1,"python");
        System.out.println(list);  //[hello, python, world, java]

        //删除功能
        list.remove("python");
        //删除指定索引的元素
        list.remove(1);
        System.out.println(list);  //[hello, java]

        //修改
        list.set(1,"python");
        System.out.println(list);  //[hello, python]

        //获取功能
        Object o = list.get(1);
        System.out.println(o); // python
        //int indexOf() 返回指定元素的第一次出现的索引
        int i = list.indexOf("python");
        System.out.println(i); //1

        //遍历集合，
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
        for (int j = 0; j < list.size(); j++) {
            String s = (String)list.get(j);
            System.out.println("List集合遍历方式2，for循环："+s);
        }

        //截取功能
        //先添加几个元素再说
        list.add("GO");
        list.add("US");
        list.add(2,"PHP");
        System.out.println(list);  //[hello, python, PHP, GO, US]
        List subList = list.subList(2, 4);
        System.out.println(subList);  //[PHP, GO]  都是包左不包右的

    }
}
