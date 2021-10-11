package com.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * @author wq
 * @since 2021-10-11 11:13
 *
 * 练习，集合的序列化和反序列化
 *  1，创建list集合存储对象，添加对象
 *  2，创建序列化流ObjectOutputStream对象，构造方法传递写入的目的地
 *  3，调用ObjectOutputStream对象的writeObject,对集合进行序列化（写到文件中）
 *  4，创建反序列化流ObjectInputStream对象
 *  5，调用ObjectInputStream对象的readObject读取文件保存在集合
 *  6，把Object类型集合转换为ArrayList类型
 *  7，遍历ArrayList集合
 *  8，释放资源
 */

public class Exercise {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //1，创建list集合存储对象，添加对象
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("张三",18));
        list.add(new Person("李四",28));
        list.add(new Person("王五",19));


        //2,创建序列化流ObjectOutputStream对象，构造方法传递写入的目的地
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("list.txt"));

        //3，调用ObjectOutputStream对象的writeObject,对集合进行序列化（写到文件中）
        oos.writeObject(list);

        //4,创建反序列化流ObjectInputStream对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("list.txt"));

        //5，调用ObjectInputStream对象的readObject读取文件保存在集合
        Object o = ois.readObject();

        //6，把Object类型集合转换为ArrayList类型
        ArrayList<Person> arr = (ArrayList<Person>)o;

        //7，遍历ArrayList集合
        for (Person p :arr) {
            System.out.println(p);
        }
        //8,关闭资源
        ois.close();
        oos.close();
    }
}

