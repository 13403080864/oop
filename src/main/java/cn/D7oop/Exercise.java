package cn.D7oop;

/**
 * @author wq
 * @since 2022-03-03 下午10:28
 */

public class Exercise {

    public void printMethod(){

        for (int i = 0; i < 10; i++) {
            System.out.print("*");
            System.out.println();
            for (int j = 0; j < 8; j++) {
                System.out.print("*");
            }
        }
    }

    public static void main(String[] args) {

        Exercise e = new Exercise();
        e.printMethod();
    }
}
