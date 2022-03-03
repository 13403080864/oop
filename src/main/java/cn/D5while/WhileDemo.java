package cn.D5while;

import java.util.Scanner;

/**
 * @author wq
 * @since 2022-02-27 下午4:48
 */

public class WhileDemo {
    //while用于 循环不确定次数的
    //像这个确定的适合用for
    public static void main(String[] args) {
        //first();
        //two();;
        Three();
    }

    public static void first() {
        int i = 0;
        while (i < 10) {
            i++;
            System.out.println(i);
        }
    }

//珠穆朗玛峰高8844.43米，若有一张足够大的纸，初始厚度0.1毫米，折叠多少次才才会有山高
    public static void two() {

        double x = 0.1;
        int num = 0;
        while (x <= 8844430){
            x = x * 2;
            num++;
        }
        System.out.println(num + "    " + x);
    }

    //用户键盘输入，统计输入整数个数，负数个数，输入0的时候退出，程序结束
    public static void Three(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入整数：");
        int num = scanner.nextInt();

        //统计正数个数
        int positiveCount = 0;

        //统计负数个数
        int negativeCount = 0;

        while (num != 0){

            if(num > 0){
                positiveCount++;
            } if(num < 0){
                negativeCount++;
            }

            System.out.println("请输入整数：");
            num = scanner.nextInt();
        }

        System.out.println("正数个数：" + positiveCount);
        System.out.println("负数个数：" + negativeCount);
        System.out.println("程序结束");

    }

}
