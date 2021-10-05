package com.classes;

/**
 * @author
 * @since 2021-09-16 16:45
 */
//冒泡排序
        public class BubbleSort {
            public static void main(String[] args) {
                int[] arr = {1,36,5,6,12};
                bubbleSoo(arr);
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i] + "\t");  //1	5	6	12	36
                }
            }
            public  static void bubbleSoo(int[] arr){
                //外循环
                for (int i = 0; i <arr.length ; i++) {
                    //内循环
                    for (int j = 0; j < (arr.length - i - 1); j++) {
                        if (arr[j] > arr[j+1]){
                            //用第三放变量获取当前值进行比较
                            int swap = arr[j];
                            //交换位置
                            arr[j] = arr[j+1];
                            arr[j+1] = swap;
                        }
                    }
                }
    }
}
