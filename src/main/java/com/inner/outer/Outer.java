package com.inner.outer;

/**
 * @author wq
 * @since 2021-10-15 16:56
 */

public class Outer {
    public void a(){
        class Inner{ //局部内部类，在方法里面，局部内部类可以写无限个
            public void inner(){
                System.out.println("局部内部类");
            }
        }
        //创建对象
        Inner inner = new Inner();
        inner.inner();
    }
}
