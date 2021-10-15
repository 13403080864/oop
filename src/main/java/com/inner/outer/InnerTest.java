package com.inner.outer;

/**
 * @author wq
 * @since 2021-10-15 17:03
 */

public class InnerTest {
    public static void main(String[] args) {
        //创建Outer对象
        Outer o = new Outer();
        o.a(); //局部内部类
    }
}
