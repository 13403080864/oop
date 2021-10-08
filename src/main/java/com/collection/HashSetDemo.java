package com.collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 * @author wq
 * @since 2021-09-24 15:07
 *  这个与hashCode有关，要重写hashCode的方法，把student的hashCode，equals重写
 *  与equals有关 重写
 */

public class HashSetDemo {
    public static void main(String[] args) {
       HashSet<Student> set = new HashSet<Student>();
        Student s1 = new Student("张三",18);
        Student s2 = new Student("李四",18);
        Student s3 = new Student("王五",20);
        Student s4 = new Student("张三",18);
        Student s5 = new Student("赵六",22);
        Student s6 = new Student("赵六",22);

        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        set.add(s5);
        set.add(s6);

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
