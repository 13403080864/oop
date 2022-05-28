package com.day06;

/**
 * @author wq
 * @since 2022-05-27 下午10:09
 */

public class Method{
    public static void main(String[] args) {
        Employee e = new Coder();
        e.work();
    }

    public static void method(Employee e){

        e.sleep();
        e.work();
    }
}
