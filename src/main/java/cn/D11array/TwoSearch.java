package cn.D11array;

/**
 * @author wq
 * @since 2022-03-27 下午9:47
 */

public class TwoSearch {

    public static void main(String[] args) {

        int[] arr = {1, 5, 66, 67, 88};

        int search = search(arr, 88);
        System.out.println(search);

    }

    public static int search(int[] arr, int key) {

        //二分查找发，新定义三个变量
        int min = 0;
        int max = arr.length - 1;
        int mid; //不能先赋值，此时还没有折半

        //要循环查找，不确定数组长度，不确定折多少次，用while
        while (min <= max) {

            mid = (min + max) / 2;

            if (key > arr[mid]) {
                min = mid + 1;
            } else if (key < arr[mid]) {
                max = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
