package com.day07;

import java.util.ArrayList;

/**
 * @author wq
 * @since 2022-05-27 下午10:15
 */

public class ArrayListDemo {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("张三", 25);
        Teacher t2 = new Teacher("李四", 35);
        Teacher t3 = new Teacher("老王", 19);
        Teacher t4 = new Teacher("赵六", 29);

        ArrayList<Teacher> list = new ArrayList<>();
        list.add(t1);
        list.add(t2);
        list.add(t3);
        list.add(t4);


        for (int i = 0; i < list.size(); i++) {
            System.out.println("普通for遍历:" + list.get(i));
        }

        for (Teacher t: list) {
            System.out.println("增强for遍历:" + t);
        }

        //获取平均值
        int sum = 0;

        for (Teacher t: list) {
            sum += t.getAge();

        }
        System.out.println("teacher的平均年龄是：" + sum/list.size()); //27


    }
}