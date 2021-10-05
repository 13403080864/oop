package com.collection.treeSet;

/**
 * @author
 * @since 2021-09-25 上午11:24
 *
 * TreeSet保证元素唯一的两种方式
 *      1.自然排序让对象所属的实现类去实现Comparable,无参构造
 *      2.比较器接口 Comparator,带参构造(常用)
 *
 */

public class Student {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student() {

    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    @Override
//    public String toString() {
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }
}
