package com.lianxi_01;

/**
 * @author wq
 * @since 2021-10-13 12:39
 * 题目：一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下，
 * 求它在第10次落地时，共经过多少米？第10次反弹多高？
 */

public class Exercise04 {
    public static void main(String[] args) {
 double h = 100,s = 100;
 for(int i=1; i<=10; i++) {
 s = s + h;
 h = h / 2;
 }
 System.out.println("经过路程：" + s);
 System.out.println("反弹高度：" + h /2);
    }
}
//经过路程：299.609375
 //       反弹高度：0.1953125
//第10次落地共经过 5766.50390625米
//第10次落地反弹 1922.16796875米
//    public static void main(String[] args) {
//        double s = 100,h= 100;
//        for (int i = 1; i <= 10; i++) {
//            h = s/2;
//            s=s + h;
//        }
//        System.out.println("第10次落地共经过 " + s + "米");
//        System.out.println("第10次落地反弹 " + h + "米");
//    }

//}
