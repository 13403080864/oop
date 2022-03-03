package cn.D4for;

/**
 * @author wq
 * @since 2022-02-27 下午3:17
 */

public class ForDemo {
    public static void main(String[] args) {
        //first();
        //Two();
        //Three();
        //Four();
        //Five();
        //Six();
        Seven();
    }

    //输出所有的水仙花数，所谓水仙花指一个3位数，各个位置上的数的立方和等于其本身 例：153 = 1*1*1 + 5*5*5 + 3*3*3
    public static void Seven(){
        for (int i = 100; i < 1000; i++) {

            //取当前数值的百位数
            int hundredValue = i / 100;

            //获取当前数值的十位数
            int tenValue = (i % 100) / 10;

            //获取当期数值个位数
            int singleValue = i / 10;

            int hundredTotal = hundredValue * hundredValue * hundredValue;
            int tenTotal = tenValue * tenValue * tenValue;
            int singleTotal = singleValue * singleValue * singleValue;

            int sum = hundredTotal + tenTotal + singleTotal;

            if(sum == i){
                System.out.println(i);
            }
        }
    }


    //1-100 的偶数和
    public static void Six(){
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if(i % 2 ==0){
                sum += i;
            }
        }
        System.out.println(sum);
    }


    //1-100 的奇数和
    public static void Five(){
        int sum = 0;
        for (int i = 1; i < 100; i++) {
            if(i % 2 ==1){
                sum += i;
            }
        }
        System.out.println(sum);
    }

    //1-100的和
    public static void Four(){
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);
    }



    //求和1-5
    public static void Three(){
        int sum = 0;
        for (int i = 0; i < 6; i++) {

            sum += i;

        }
        System.out.println(sum);

    }

        public static void first(){

        for (int i = 1; i < 6; i++) {
            System.out.println(i);
       }
    }

    public static void Two(){

        for (int i = 5; i > 0; i--) {
            System.out.println(i);
        }
    }



}
