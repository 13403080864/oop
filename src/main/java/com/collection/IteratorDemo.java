package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author wq
 * @since 2021-09-23 10:16
 */

public class IteratorDemo {
    /**
     * 成员方法：
     * Object next() 获取下一个元素,返回的是Object类型
     * hasNext()     判断是否还有下一个元素
     */
    public static void main(String[] args) {
        //创建对象
        ArrayList al = new ArrayList();
        al.add("hello");
        al.add("world");
        al.add("java");

        //遍历集合
        /** 方式一: 将集合转换为数组，在遍历，但基本不用（toArray()方法）
         *         Object[] objects = al.toArray();
         *         for (int i = 0; i < objects.length; i++) {
         *             System.out.println(objects[i]);
         *         }
         */

        //方式二：
        //通过集合对象获取迭代器对象
        Iterator it = al.iterator();
        //判断是否有下一个元素，不知道有多少个元素，所以用while
        while (it.hasNext()) {
            //获取下一个元素
            //System.out.println(it.next());
            //已知是String类型，所以直接用String接收
           String s = (String) it.next();
            System.out.println(s);

        }
        //遍历集合方式3
        for (int i = 0; i < al.size(); i++) {
            //已知是String类型，所以直接用String接收
            String str = (String)al.get(i);
            System.out.println("集合遍历方式2："+str);
        }

    }

}