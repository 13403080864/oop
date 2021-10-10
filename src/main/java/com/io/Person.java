package com.io;


import java.io.Serializable;

/**
 * @author
 * @since 2021-10-10 下午5:00
 *
 * 序列化和反序列化时要实现Serializable接口，
 * 不实现此接口的类将不会使任何状态序列化或反序列化，会抛出`NotSerializableException`
 * Serializable 是一个标记接口
 */

public class Person implements Serializable {

    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

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

    @Override
    public String toString() {
        return "DemoObjectOutputStream_Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

