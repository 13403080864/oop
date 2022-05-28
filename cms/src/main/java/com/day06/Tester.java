package com.day06;


/**
 * @author wq
 * @since 2022-05-26 下午11:00
 */

public class Tester extends Employee {
    public static void main(String[] args) {
        Employee employee = new Tester();
    }

    public void work(){
        System.out.println("Tester 的work方法");
    }
}
