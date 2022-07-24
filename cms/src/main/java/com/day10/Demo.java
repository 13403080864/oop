package com.day10;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wq
 * @since 2022-06-07 14:03
 */
//list 和数组互转
public class Demo {
    //list转换为数组
    public static void main(String[] args) {
        arrayToList();
        String a = "aaa";
        String b = "bbb";
        String c = "ccc";
        List list = new ArrayList();
        list.add(a);
        list.add(b);
        list.add(c);
        System.out.println(list);
        //创建数组
        String[] strings = new String[list.size()];
        //把list的数据添加到数组中
        for (int i = 0; i < strings.length; i++) {
            strings[i] = (String) list.get(i);
        }
        //遍历数组
        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static void arrayToList(){
        String[] str  = new String[]{"a","b","d"};
        List<String> list = new ArrayList<>();
        for (String s : str) {
            list.add(s);
        }
        System.out.println(list);
    }
}
