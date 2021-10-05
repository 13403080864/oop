package com.arrays;

import java.util.Arrays;

/**
 * @author wq
 * @since 2021-09-17 11:28
 */

public class ArraysTest {
    public static void main(String[] args) {
        int[] arr = {1,5,55,18};
        //arraysToString(arr);   //[1,5,55,18]
        arraySort(arr);
        System.out.println(Arrays.toString(arr)); //[1, 5, 18, 55]

        //int search = arrayBinarySearch(arr, 5); //1
        int search2 = arrayBinarySearch(arr, 55); //3
        int search3 = arrayBinarySearch(arr, 6); //3
        System.out.println(search3); //-3
    }
    //static int binarySearch(数组,查找的关键字) 对数组 进行二分搜索法，
    // 即找出key对应的数,当查找的数在数组中没有时，返回（-插入书-1）
    //数组必须要有序
    public static int arrayBinarySearch(int[] arr,int key){
        int index = Arrays.binarySearch(arr, key);
        return index;

    }

    //static String toString(数组) 返回数组字符串表现形式
    //自动遍历数组，
    public static void arraysToString(int[] arr){
        String s = Arrays.toString(arr);

    }

    //static void sort(数组) 对数组进行升序排列 (目前为止效率最快)
    public static void arraySort(int[] arr){
        Arrays.sort(arr);
    }
}
