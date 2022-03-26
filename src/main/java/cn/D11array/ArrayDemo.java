package cn.D11array;

/**
 * @author wq
 * @since 2022-03-16 下午10:15
 */

public class ArrayDemo {

    //倒着遍历
    public static void main(String[] args) {

        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};


        for (int i = 0; i < 9; i++) {

            String b = "13";

            for (int j = 0; j <=9 ;j++) {

                int v =arr[(int)(Math.random() * 10)];

                b = b + v;

            }

            System.out.println(b);
        }


    }

}
