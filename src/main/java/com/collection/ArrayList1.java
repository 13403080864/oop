package com.collection;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author wq
 * @since 2021-09-24 9:32
 *
 * 要去重复的
 */

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        Student s1 = new Student("张三",20);
        Student s2 = new Student("李四",21);
        Student s3 = new Student("王五",22);
        Student s4 = new Student("张三",20);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        //创建新集合
        ArrayList list1 = new ArrayList();
        //遍历旧集合，获取每一个元素
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            Student s = (Student)iterator.next();
            //判断新集合，看是否包含这个元素
            if(!list1.contains(s)){
                //如果s在list1中不存在，就添加
                list1.add(s);
            }
        }
        //list1就是没有重复的集合
        //遍历list1
        for (int i = 0; i < list1.size(); i++) {
            Student str = (Student)list1.get(i);
            System.out.println(str.getName()+ str.getAge());
        }
    }
}
