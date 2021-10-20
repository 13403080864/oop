package com.arrays;

/**
 * @author wq
 * @since 2021-10-19 10:54
 * 数组的翻转
 */

public class Reverse {
    public static void main(String[] args) {
        int arr[] ={1,2,55,3,4};
        arrReverse(arr);
    }
    public static void arrReverse( int arr[]){
        //int arr[] ={1,2,55,3,4};
        //最远的元素，交换位置（第三方变量）
        for (int min = 0,max = arr.length -1 ; min < max ; min++,max--) {
            int temp = arr[min]; //记录数组最小索引位置的元素
            arr[min] = arr[max];
            arr[max] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
