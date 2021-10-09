package com.map.treeMap;

import java.util.Comparator;

/**
 * @author wq
 * @since 2021-09-27 20:18
 */

public class MyComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        int num = s1.getAge() -s2.getAge();
        int num2 = (num ==0)? s1.getName().compareTo(s2.getName()):num;
        return num2;
    }
}
