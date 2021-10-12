package com.stream.MethodReferenceObject;

/**
 * @author wq
 * @since 2021-10-12 10:53
 *
 * 使用方法引用优化lambda表示式
 *  对象要已经存在
 *  成员方法已经存在
 */

public class Demo1MethodReferenceObject {
    //定义一个方法，参数传递Printable接口
    public static void printString(Printable p){
        p.print("Hello");
    }

    public static void main(String[] args) {
        //调用printString方法，参数是Printable接口，可以传递一个lambda表示式
        printString((s)->{
            //创建MethodReObject对象
            MethodReObject obj = new MethodReObject();
            //调用MethodReObject对象的成员方法，将字符串大写输出
            obj.printUpperString(s); //HELLO
        });

        /**
         * 使用方法引用优化lambda表示式
         * 对象已经存在MethodReObject
         * 成员方法已经存在
         */
        //创建MethodReObject对象
        MethodReObject obj = new MethodReObject();
        printString(obj::printUpperString); //HELLO
    }
}
