package cn.D3switch;

import java.util.Scanner;

/**
 * @author wq
 * @since 2022-02-26 下午3:51
 */

public class SwitchDemo2 {
    public static void main(String[] args) {
        System.out.println("请输入分数");
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();

        if(score == 100){
            System.out.println("BMW");
        }else if(score>80 && score<=99){
            System.out.println("iphone");
        }else if(score>=60 && score<=80){
            System.out.println("ipad");
        }else if(score>60 && score<80){
            System.out.println("无");
        }else {
            System.out.println("成绩不对");
        }
    }
}
