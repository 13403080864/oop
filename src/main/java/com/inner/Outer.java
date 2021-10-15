package com.inner;

/**
 * @author wq
 * @since 2021-10-15 16:22
 */
//外部类
public class Outer {
    public void outer(){
        System.out.println("外部类outer");
    }
    //内部类
    public class inner{
        public void inner(){
            //内部类调用外部类
            outer();
            System.out.println("内部类inner");
        }
    }
}
