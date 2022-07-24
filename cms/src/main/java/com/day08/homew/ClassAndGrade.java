package com.day08.homew;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author wq
 * @since 2022-05-31 13:34
 */

public class ClassAndGrade {
    public static void main(String[] args) {

        Student studentA = new Student("张三",25,"男");
        Student studentB = new Student("李四",26,"男");
        Student studentC = new Student("小花",27,"女");
        Student studentD = new Student("小明",28,"男");
        Student studentE = new Student("小红",29,"女");

        List<Student> list1 = new ArrayList<>();
        list1.add(studentA);
        list1.add(studentB);
        list1.add(studentC);

        List<Student> list2 = new ArrayList<>();
        list2.add(studentD);
        list2.add(studentE);

        Map<String, List<Student>> map = new HashMap<>();
        map.put("1801",list1);
        map.put("1802",list2);

        //通过键获取值
        Set<String> stringSet = map.keySet();
        for (String s : stringSet) {
            System.out.println(s);
            List<Student> students = map.get(s);
            System.out.println(students);

        }
        System.out.println("============");

        //直接获取键值对
        Set<Map.Entry<String, List<Student>>> entries = map.entrySet();
        for (Map.Entry<String, List<Student>> entry : entries) {
            String key = entry.getKey();
            List<Student> value = entry.getValue();
            System.out.println(key + value);
        }
//
//        Set<Student> students = map.keySet();
//        for (Student student : students) {
//            String s = map.get(student);
//            System.out.println(s + "班的学生有:" + student);
//        }
//
//        System.out.println("==================");
//        Set<Map.Entry<Student, String>> entries = map.entrySet();
//        for (Map.Entry<Student, String> entry : entries) {
//            String value = entry.getValue();
//            Student key = entry.getKey();
//            System.out.println( value+ key);
//        }
        }
}

