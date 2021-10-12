package com.stream.MethodReferenceObject;

/**
 * @author wq
 * @since 2021-10-12 11:20
 *
 * 通过类名引用静态成员方法
 * 类已存在，静态方法已存在
 * 就可以通过类名引用静态方法
 */

public class CalcableStaticMethodReference {
    //定义一个方法，参数传递整数，和一个函数式接口Calcable
    public static int method(int num,Calcable c){
        return c.calcableAbs(num);
    }

    public static void main(String[] args) {
        //调用method方法，传递计算绝对值的整数，传递lambda表示式
        int i = method(-9, (n) -> {
            //对传入的值进行计算，并返回
            return Math.abs(n);
        });
        System.out.println(i);

        /**
         * 用类名引用静态方法名优化lambda表示式
         * Math类存在，calcableAbs计算方法存在
         */
        int i1 = method(-8, Math::abs);
        System.out.println(i1);
    }


}
