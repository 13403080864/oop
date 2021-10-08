package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author wq
 * @since 2021-09-23 15:56
 * 集合遍历功能：
 *      hasNext()
 *      next()
 * list集合特有功能（逆向遍历）：
 *      hasPrev
 */

public class ListCollection3 {
    public static void main(String[] args) {
        //list集合特有功能
        List list = new ArrayList();
        list.add("hello");
        list.add("world");
        list.add("java");
        list.add("javaEE");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            String s = (String)iterator.next();
            //System.out.println(s); //结果是每个元素，没有括号
        }
//        //正向遍历
        System.out.println(list); //[hello, world, java, javaEE]
        //逆向遍历,只有先正向遍历完后，才可以逆向遍历
//        while (iterator.hasPrevious()){
//            String s = (String)iterator.previous();
//
//        }
    }
}
