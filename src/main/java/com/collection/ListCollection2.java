package com.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * @author wq
 * @since 2021-09-23 14:23
 */

public class ListCollection2 {
    public static void main(String[] args) {
        List list = new ArrayList();
        //添加功能
        list.add("hello");
        list.add("world");
        list.add("java");
//        list.add("javaEE");
        //需求：判断list集合中是否有hello 有的话添加一个SSEE
        //也需要遍历，要么用集合，要么用迭代器（迭代器只能用列表迭代器listIterator），不可两个一起用
        //1.用普通for循环，list操作的,元素添加到最后面
//        for (int i = 0; i < list.size(); i++) {
//            String s = (String)list.get(i);
//            if("hello".equals(s)){
//                 list.add("SSEE");
//                //System.out.println(list); //元素添加到最后面
//            }
//        }
//        System.out.println(list);[hello, world, java, javaEE,SSEE] //元素添加到最后面

        //2.用迭代器listIterator，元素添加到刚遍历的那个元素后面
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()){
            String str = (String)listIterator.next();
            if("hello".equals(str)){
                listIterator.add("SSEE");
            }
        }
        System.out.println("listIterator方法遍历：" + list); //[hello, SSEE, world, java, javaEE] 元素添加到刚遍历的那个元素后面
    }
}
