package com.stream.MethodReferenceObject;

/**
 * @author wq
 * @since 2021-10-12 10:45
 */
//定义函数式接口
    @FunctionalInterface
public interface Printable {
    //定义字符串的抽象方法
    void print(String s);
}
