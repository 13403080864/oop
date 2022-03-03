package cn.D6array;

import java.util.Arrays;

/**
 * @author wq
 * @since 2022-03-03 下午8:26
 */

public class ArraysDemo {
    public static void main(String[] args) {
        int[] arr = {1,36,5,6,12};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
