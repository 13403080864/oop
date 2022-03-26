package cn.D11array;

/**
 * @author wq
 * @since 2022-03-20 下午10:18
 */

public class RandomNum {
    public static void main(String[] args) {

        //oneNum();
        manyNum();

    }


    public static void oneNum(){

    String b = "13";

        for (int i = 0; i < 10; i++) {

            b=b+(int)(Math.random()*10);
        }

        System.out.println(b);
    }




    public static void manyNum(){

        for (int i = 0; i < 9; i++) {

            String b = "13";

            for (int j = 0; j < 10; j++) {

                b=b+(int)(Math.random()*10);
            }

            System.out.println(b);
        }
        }
    }

