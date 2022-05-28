package com.day06;

/**
 * @author wq
 * @since 2022-05-26 下午10:59
 */

public class Coder extends Employee {
    public static void main(String[] args) {
        Employee employee = new Coder();
        employee.work();//Coder的 work方法
    }
    public void work(){
        System.out.println("Coder的 work方法");
    }
}
