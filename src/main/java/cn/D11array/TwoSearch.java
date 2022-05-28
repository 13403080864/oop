package cn.D11array;

/**
 * @author wq
 * @since 2022-03-27 下午9:47
 *
 * 数组折半：求key=15的索引
 * 例：arr[] = {1,5,8,12,15}
 *
 * mid = (min + max)/2(若对折是小数，去最大的整数 3.5 就是3)
 * 数组折半后索引是2，key > arr[2] ,arr[2]前面的不考虑，最小索引移动到3
 * min = mid +1
 * 数组折半后索引是3，key > arr[3],arr[3]前面的不考虑，最小索引移动到4
 * min = mid + 1
 * 找到了索引为4就是15
 *
 * 若找的是5 （key 在mid的左边）
 * 数组折半后索引是2，key < arr[2],arr[2]后面的不考虑，最大索引移动到1
 * max = mid -1
 */

public class TwoSearch {

    public static void main(String[] args) {

        //传数组参数
        int[] arr = {1, 5, 66, 67, 88};

        int search = search(arr, 88);
        System.out.println(search); //4(索引为4)

    }

    public static int search(int[] arr, int key) {

        //二分查找发，新定义三个变量
        int min = 0;
        int max = arr.length - 1;
        int mid; //不能先赋值，此时还没有折半

        //要循环查找，不确定数组长度，不确定折多少次，用while
        //前提就是最小值小于最大值
        while (min <= max) {

            //中间的所引值的计算
            mid = (min + max) / 2;

            //当指定的key 大于中位数时，舍弃左边的数
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
