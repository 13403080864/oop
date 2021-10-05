package com.collection.treeSet;

import java.util.Comparator;

/**
 * @author
 * @since 2021-09-25 上午11:28
 *
 * 需求:按照年龄排序
 */

public class TreeSetDemoMyComparator implements Comparator<Student> {


    public int compare(Student s1, Student s2) {

        /*
        //按照年龄排序,次处就是直接用s1,s2 比较
        //在Student类外部，就不能直接用属性看，必须用类提供的方法调用

        int num = s1.getAge() - s2.getAge();

        //当年龄相同的时候，姓名比较

        int num2 = (num == 0 )? s1.getName().compareTo(s2.getName()):num;

        return num2;
        */



        //比较姓名长度

        int num = s1.getName().length() - s2.getName().length();

        //长度相同，比较内容

        int num2 = (num == 0)? s1.getName().compareTo(s2.getName()):num;

        //长度相同，比较内容，年龄可能不同

        int num3 = (num2 == 0)? s1.getAge() - s2.getAge():num2;

        return num3;
    }
}
