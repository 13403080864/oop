package cn.D12Exercise;

import java.util.Scanner;

/**
 * @author wq
 * @since 2022-05-28 下午4:12
 *
 * //键盘输入3个数，输出最大的数
 */

public class Demo01 {
    public static void main(String[] args) {
        //键盘输入3个数，输出最大的数

        int[] arr = new int[3];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入数字：");
            Scanner sc = new Scanner(System.in);
            int nextInt = sc.nextInt();
            arr[i] = nextInt;

        }

        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("最大的数是："+max);

    }
    //@Test
    public void testMax() {
        //键盘输入3个数，输出最大的数
        System.out.println("请输入数字：");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt(3);
        System.out.println("请输入数字：");
    }
}