package cn.D6array;

/**
 * @author wq
 * @since 2022-03-03 下午8:20
 */

public class MultiDimensionArray {
    public static void main(String[] args) {
        //创建多维数组
        int[][] array = new int[3][];
        //给多维数组的[0]创建一个长度为3的一维数组
        array[0] = new int[3];
        array[0][0] = 3;
        array[0][1] = 5;
        array[0][2] = 8;

        array[1] = new int[2];
        array[1][0] = 12;
        array[1][1] = 9;

        array[2] = new int[4];
        array[2][0] = 7;
        array[2][1] = 0;
        array[2][2] = 6;
        array[2][3] = 4;

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            int[] arr = array[i];

            for (int j = 0; j < arr.length; j++) {
                //System.out.println(arr[j]); 这个是打印所有遍历的数

                sum += arr[j];
            }
        }
        System.out.println(sum);
    }
}
