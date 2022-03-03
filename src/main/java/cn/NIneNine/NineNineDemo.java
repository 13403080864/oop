package cn.NIneNine;

/**
 * @author wq
 * @since 2022-02-27 下午9:26
 * 九九乘法表
 */

public class NineNineDemo {
    public static void main(String[] args) {

        for (int i = 1; i <= 9; i++) {

            for (int j = 1; j <=i; j++) {
                System.out.print(i + "*" + j + "=" + (i * j) + "\t");

            }
            System.out.println();
        }

        System.out.println("=======================");


    }
}
