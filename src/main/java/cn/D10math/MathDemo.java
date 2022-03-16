package cn.D10math;

/**
 * @author wq
 * @since 2022-03-16 下午10:04
 */

public class MathDemo {

    public static void main(String[] args) {

        int abs = Math.abs(-7);  //取绝对值

        System.out.println(abs); //7


        //随机数
        double random = Math.random();  //[0.0,1.0)

        System.out.println(random);

        //四舍五入
        long round = Math.round(3.45);
        System.out.println(round);  //3

        //a的b次方
        double pow = Math.pow(2, 3); //2的3次方
        System.out.println(pow);
    }
}
