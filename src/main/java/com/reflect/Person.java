package com.reflect;

import java.sql.SQLOutput;

/**
 * @author wq
 * @since 2021-10-19 14:30
 */

public class Person {
    private String name;
    public int age;
    public Person(){

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void show(){
        System.out.println("show");
    }
    public void function(String s){
        System.out.println("function:" + s);
    }
    public String returnValue(String name,int age){
        return "hello"+ name + "---" + age;
    }
    private void hello(){
        System.out.println("helloworld");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
