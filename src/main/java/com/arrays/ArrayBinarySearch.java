package com.arrays;

import java.util.Arrays;

/**
 * @author wq
 * @since 2021-10-19 13:34
 * 对数组 进行二分搜索,即返回的是指定的数的对应下标
 * Arrays.binarySearch(arr, key)
 */

public class ArrayBinarySearch {
    public static void main(String[] args) {
        char[] arr = {'a','b','c','d','r'};
        arrayBinarySearch(arr,'d');  //3
    }
    public static void arrayBinarySearch(char[] arr,char key){
        int binarySearch = Arrays.binarySearch(arr, key);
        System.out.println(binarySearch);

    }
}
