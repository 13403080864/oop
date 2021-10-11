package com.io;

import com.classes.Person;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author
 * @since 2021-10-10 下午4:44
 *
 *  序列化 ObjectOutputStream
 *  特有的成员方法：
 *          void writeObject(Object obj) 将制定的对象写入 ObjectOutputStream
 *  使用步骤：
 *      1，创建ObjectOutputStream 对象，构造方法中传递字节输出流
 *      2，使用ObjectOutputStream对象的方法writeObject，把对象写入到文件中
 *      3，释放资源
 */

public class DemoObjectOutputStream {

    public static void main(String[] args) throws IOException {

        //1，创建ObjectOutputStream 对象，构造方法中传递字节输出流

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("persion.txt"));

        //2,使用ObjectOutputStream对象的方法writeObject，把对象写入到文件中

        oos.writeObject(new Person("张三",18));

        //3,释放资源
        oos.close();
    }
}
