package com.map.treeMap;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

/**
 * @author wq
 * @since 2021-09-27 20:04
 * 用TreeMap时 必须先定义排序规则（就是排序）
 * 实现排序两种方式：
 *   1.自然排序让对象所属的实现类去实现Comparable,无参构造
 *   2.比较器接口 Comparator,带参构造（常用）
 */

public class TreeMap_Custom {
    public static void main(String[] args) {
        Comparator c = new MyComparator();
        TreeMap<Student,String> tm = new TreeMap<Student,String>(c);

        Student s01 = new Student("武则天" ,28);
        Student s02 = new Student("李世民" ,20);
        Student s03 = new Student("朱元璋" ,48);
        Student s04 = new Student("朱元璋" ,48);
        tm.put(s01,"it001");
        tm.put(s02,"it002");
        tm.put(s03,"it003");
        tm.put(s03,"it004");
        Set<Student> students = tm.keySet();
        for(Student key :students){
            String s = tm.get(key);
            //System.out.println(s);
            //System.out.println(key);
            System.out.println(s +"  "+ key.getName() + key.getAge());
        }

    }
}
