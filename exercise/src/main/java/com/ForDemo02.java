package com;

/**
 * @author
 * @since 2022-03-08 下午7:45
 */

public class ForDemo02 {

    public static void main(String[] args) {

        int[] arr = {5,7,3,9,2};

        for (int i = 0; i < arr.length-1; i++) {

            if (arr[i] > arr[i+1]){

               int temp = arr[i+1];

               arr[i+1] = arr[i];

               arr[i] = temp;

            }

        }

        for (int j = 0; j < arr.length; j++) {

            System.out.println(arr[j]);

        }

    }
}
