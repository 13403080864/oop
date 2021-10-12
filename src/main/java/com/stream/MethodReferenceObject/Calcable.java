package com.stream.MethodReferenceObject;

/**
 * @author wq
 * @since 2021-10-12 11:17
 */
@FunctionalInterface
public interface Calcable {
    //定一个抽象方法，计算绝对值，传递一个参数
    int calcableAbs(int n);
}
