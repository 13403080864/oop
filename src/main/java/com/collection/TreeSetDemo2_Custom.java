package com.collection;

import java.util.TreeSet;

/**
 * @author
 * @since 2021-09-25 上午9:32
 *
 * TreeSet保证元素唯一的两种方式
 *      1.自然排序让对象所属的实现类去实现Comparable,无参构造
 *  *      2.比较器接口 Comparator,带参构造(常用)
 *
 * 需求1：按照年龄排序，年龄一样按照姓名排序
 * 需求2：按照姓名长度排序
 */

public class TreeSetDemo2_Custom {

    public static void main(String[] args) {

        //创建对象
        TreeSet<Student> treeSet = new TreeSet<Student>();

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
