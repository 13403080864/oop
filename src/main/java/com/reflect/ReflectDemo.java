package com.reflect;

/**
 * @author wq
 * @since 2021-10-20 10:53
 * 获取Class对象的方式
 *  1,Class.forName("全类名") 常用
 *  2,类名.class
 *  3,对象.getClass
 */

public class ReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        //1,Class.forName("全类名") 常用
        Class<?> forName = Class.forName("com.reflect.Person");
        System.out.println("forName:"+forName);
        //2,类名.class
        Class<Person> personClass = Person.class;
        System.out.println("类名.class: "+personClass);
        //3,对象.getClass
        Person person = new Person();
        Class<? extends Person> aClass = person.getClass();
        System.out.println("对象.getClass: "+aClass);
    }
}
