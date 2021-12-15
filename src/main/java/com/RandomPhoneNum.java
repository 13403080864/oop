package com;

import java.util.Random;

/**
 * @author wq
 * @since 2021-12-15 16:04
 */

public class RandomPhoneNum {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Random r = new Random();
            String num = "189";

            for (int j = 0; j < 8; j++) {
                num +=r.nextInt(9);
            }
            System.out.println(num);
        }

    }
}
