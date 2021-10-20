package com.arrays;

import java.util.Arrays;

/**
 * @author wq
 * @since 2021-10-19 11:15
 * Arrays.toString(参数)  返回数组字符串 String toString(数组)
 * Arrays.sort(arr),static void sort(数组) ; 对数组进行升序排序 效率最高
 */

public class StringArray {
    public static void main(String[] args) {
        int[] arr = {1,2,55,9};
        //arrayToString(arr);
        sort(arr);
    }
    public static void arrayToString(int[] arr){
        String s = Arrays.toString(arr);
        System.out.println(s); //[1, 2, 55, 9]
    }
    public static void sort(int[] arr){
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); //[1, 2, 9, 55]
    }
}
