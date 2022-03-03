package cn.D6array;

import java.util.Scanner;

/**
 * @author wq
 * @since 2022-03-03 下午8:21
 */

public class Exercise {
    public static void main(String[] args) {
        double[] score = new double[3];
        String[] name = new String[3];

        //定义变量保存最高分、最低分（注意放的位置也是很有关系的，这两个变量放在这个不行的）
//        double maxScore = score[0];
//        double minScore = score[0];
        //定义一个变量保存分数
        //int scoreNum = 0;

        for (int i = 0; i < name.length; i++) {
            System.out.println("请输入姓名：");
            Scanner scanner = new Scanner(System.in);
            String s1 = scanner.next();
            scanner.nextInt();
            name[i] = s1;

            System.out.println("请输入分数：");
            Scanner scanner1 = new Scanner(System.in);
            double scoreNum = scanner.nextInt();  // 这里输入小数就不行
            score[i] = scoreNum;

        }

        for (int j = 0; j < name.length; j++) {
            System.out.println(name[j]);
        }
        //定义变量保存最高分、最低分 （原来放在上面的，是不行的）
        double maxScore = score[0];
        double minScore = score[0];
        for (int j = 0; j < score.length; j++) {
            System.out.println(score[j]);
            //先取出数组中的数与设置的最大值比较（重要 要先取一个数，自己写忘了这个步骤）
            double num  = score[j];
            if(num > maxScore){
                maxScore = num;
            }
            if(num < minScore){
                minScore = num;
            }
        }



//        for (int m = 0; m < score.length; m++) {
//            //先取出数组中的数与设置的最大值比较（重要 要先取一个数，自己写忘了这个步骤）
//
//            double num = score[m];
//            if(num < minScore){
//                minScore = num;
//            }
//        }
        System.out.println("最高分是：" + maxScore + "最低分是：" + minScore);
    }
}

