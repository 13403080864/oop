package com.lianxi_01;

import java.util.Scanner;

/**
 * @author wq
 * @since 2021-10-12 17:30
 */

public class Exercise02 {
    public static void main(String[] args) {
        int digital = 0;
        int character = 0;
        int blank = 0;
        int other = 0;
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        //String s = "hfakf 12./.";
        char[] ch = null;
        ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if(ch[i] >='0' && ch[i] <='9'){
                digital++;
            }else if((ch[i] >='a' && ch[i] <='z' )||(ch[i] >='A' && ch[i] <='Z')){
                character++;
            }else if(ch[i] == ' '){
                blank++;
            }else {
                other++;
            }
        }

        System.out.println("数字个数为："+digital);
        System.out.println("字母个数为："+character);
        System.out.println("空白个数为："+blank);
        System.out.println("其他个数为："+other);
    }
}
