package com.day06;

/**
 * @author wq
 * @since 2022-05-26 下午11:01
 */

public class Manager extends Employee {
    public static void main(String[] args) {
        Employee employee = new Manager();
    }

    public void work(){
        System.out.println("Manager的 work方法");
    }
}
