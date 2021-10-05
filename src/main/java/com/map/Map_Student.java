package com.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author
 * @since 2021-09-25 下午4:24
 *
 * 自定义类遍历
 */

public class Map_Student {

    public static void main(String[] args) {

        Map<String, Student> map = new HashMap<String, Student>();

        Student s1 = new Student("武则天" ,28);
        Student s2 = new Student("李世民" ,20);
        Student s3 = new Student("朱元璋" ,48);

        map.put("it001",s1);
        map.put("it002",s2);
        map.put("it003",s3);

        //1.遍历.需先借助，先集中键；根据键获取，可以获取键，也可以获取值
        Set<String> stringSet = map.keySet();

        for (String key : stringSet){

            Student student = map.get(key);

            System.out.println(key+"  " +student.getName()+"  " +student.getAge());
        }

        System.out.println("--------------------------------");


        //2.遍历 键，也可以获取值，仅仅获取值
        Collection<Student> values = map.values();

        //增强for
        for(Student stu : values){

            System.out.println(stu.getName() + stu.getAge() );

        }
        System.out.println("------------*********--------------------");

        //3.最方便 获取键值对对象的集合，然后可以想打印那个获取那个

        Set<Map.Entry<String, Student>> entrySet = map.entrySet();

        for(Map.Entry<String, Student> entry :entrySet){

            String key = entry.getKey();
            Student value = entry.getValue();

            //System.out.println(key);  //仅仅打印键

            //System.out.println(value.getName() + value.getAge());  //仅仅打印值

            System.out.println(key + "  "  + value.getName() + " " + value.getAge());  //打印键和值

        }

    }
}


