package com.collection;

/**
 * @author wq
 * @since 2021-09-24 9:36
 */

public class Student implements Comparable<Student> {
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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    //重写hashCode方法
    @Override
    public int hashCode() {
        return 0;
    }

    //重写equals方法


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                name.equals(student.name);
    }


    /**
     * 需求1的：按照年龄排序，年龄一样按照姓名排序
     *     public int compareTo(Student s) {
     *
     *         //需求比较年龄
     *         int num = this.age - s.age;
     *
     *         //当年龄相同，比较姓名 姓名比较不能直接相减 用compareTo
     *         int num2 = (num == 0) ? (this.name.compareTo(s.name)) : num;
     *
     *         return num2;
     *     }
     */


    //需求2：按照姓名长度排序
    //  注意需求给的是主要的，要考虑的是是其次的可能，姓名长度相同的时候，也可能是同一个人，还得你叫年龄

    public int compareTo(Student s) {

        int num = this.name.length() - s.name.length();

        //当长度相同比较内容

        int num2 = (num == 0) ? (this.name.compareTo(s.name)) : num;

        //当内容，长度都相同，年龄可能不同，再次比较

        int num3 =(num2 == 0)?(this.age - s.age): num2;

        return num3;
    }

}
