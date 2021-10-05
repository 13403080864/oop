package com.classes;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person("张三",18);
        String s = person.toString();
        System.out.println(s);

        Person person1 = new Person();
        String lisi = person1.toString("Lisi");
        System.out.println(lisi);

    }
}


