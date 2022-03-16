package cn.D11array;

/**
 * @author wq
 * @since 2022-03-16 下午10:15
 */

public class ArrayDemo {

    //倒着遍历
    public static void main(String[] args) {

        int[] arr = {1,2,3};

        for (int i = arr.length - 1;i >= 0;i--) {

            System.out.println(arr[i]);
        }
    }
}
