package com.inner;

/**
 * @author wq
 * @since 2021-10-15 16:24
 */

public class InnerTest {
    public static void main(String[] args) {
        //外部类调用内部类
        //公式： 外部类名.内部类名 = new 外部类对象（）.new 内部类对象（）；
        Outer.inner oi = new Outer().new inner();
        oi.inner();   //外部类outer   内部类inner

        //内部类调外部类
        //可以直接在内部调用即可

    }
}
