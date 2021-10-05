package com.wrapper;

/**
 * @author wq
 * @since 2021-09-18 9:49
 */

public class IntegerTest {
    public static void main(String[] args) {
        StringToInt();  //101

    }

    /**
     * String转 int方法
     *  1，静态方法parseInt  (常用)
     *  2，非静态方法.intValue(),还要先创建对象
     */
    public static void StringToInt(){
        //静态方法parseInt
        int i = Integer.parseInt("100");
        int result = i + 1;
        System.out.println(result);  //101

        //非静态方法 intValue()
        Integer integer = new Integer("99");
        int intValue = integer.intValue();
        System.out.println(intValue + 1);  //100
    }
}
