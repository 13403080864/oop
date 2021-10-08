package com.collection.treeSet;


import java.util.TreeSet;

/**
 * @author
 * @since 2021-09-25 上午11:43
 */

public class TreeSetDemo2_Custom2 {

    public static void main(String[] args) {

        //Comparator c = new TreeSetDemoMyComparator();

        //创建对象
        //TreeSet<Student> treeSet = new TreeSet<Student>(c);

        //以上两步简写为一步
        TreeSet<Student> treeSet = new TreeSet<Student>(new TreeSetDemoMyComparator());

        //创建自定义的对象
        Student s1 = new Student("张三",20);
        Student s2 = new Student("李四",21);
        Student s3 = new Student("王五",22);
        Student s4 = new Student("王器",22);
        Student s5 = new Student("张三",20);
        Student s6 = new Student("张三以",20);
        Student s7 = new Student("张三以",24);

        //添加元素
        treeSet.add(s1);
        treeSet.add(s2);
        treeSet.add(s3);
        treeSet.add(s4);
        treeSet.add(s5);
        treeSet.add(s6);
        treeSet.add(s7);

        //遍历集合
        for (Student s : treeSet){
            //此处的打印的内容是根据Student 中compareTo 的返回值有关
            //（ 相减）return 0时；结果：元素就不往集合中添加，保证元素唯一， 返回就第一个，张三  20
            //return 正数时；说明元素比以前发大，往后放，即为正序
            //return 负数时；说明元素比以前发小，往前放，即为倒序

            System.out.println(s.getName() + "  " + s.getAge());
        }
    }
}
