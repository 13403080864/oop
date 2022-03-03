package cn.D3switch;

import java.util.Scanner;

/**
 * @author wq
 * @since 2022-02-26 下午4:09
 * 比较三个数 从小到大排序
 */

public class Exercises {
    public static void main(String[] args) {
        //first();
        //Two();
        //Three();
        //Four();
        Five();
    }

    public static void first(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入第一个数：");
        int num1 = scanner.nextInt();

        System.out.println("请输入第二个数：");
        int num2 = scanner.nextInt();

        System.out.println("请输入第三个数：");
        int num3 = scanner.nextInt();

        int swap = 0;
        //num1 和num2比较
        if(num1 > num2){
            swap = num2;
            num2 = num1;
            num1 = swap;
        }
        //num2 和num3比较
        if (num2 > num3){
            swap = num3;
            num3 = num2;
            num2 = swap;

            //num2 和num3比较 交换了位置，现在最大的是 num2(新的)
            //再次比较num1 和mun3 其实就是 1 和 3比较
            if(num1 > num2){
                swap = num2;
                num2= num1;
                num1 = swap;
            }
        }

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
    }

// 2.声明两个值，判断和是否大于等于50，若是的 打印"hello world"

    public static void Two(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个值：");
        int i = scanner.nextInt();
        System.out.println("请输入第二个值：");
        int j = scanner.nextInt();

        if(i + j >= 50){
            System.out.println("hello world");
        }else {
            System.out.println("哈哈");
        }
    }

// 3.声明2个double类型的变量并赋值，判断第一个数大于10.0，且第二个数小于20.0，打印两个数的和，否则打印乘积

    public static  void Three(){

        double x = 10.3;
        double y = 19.4;

        if(x > 10.0 && y < 20.0){
            System.out.println( x + y);
        }else {
            System.out.println(x*y);
        }
    }

// 4.  狗狗的前两年相当于人的10.5岁，后面每增加一年就增加4岁， 依据输入的狗狗年龄  ，算出相当于人的多少岁

    public static void Four(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入狗狗年龄：");
        double age = scanner.nextInt();

        double sum = 0;
        if(age <= 2 && age > 0){
            sum =  (10.5 * age);
            System.out.println(sum );
        }else if(age > 2){
            sum = (10.5 * 2) +(age-2)*4;
        }

        System.out.println("狗狗年龄相当于人类"+sum + "岁");

    }

 //  5.才中彩票
    public static void Five(){
        //现获取随机的两位数
        double v = Math.random() * 100;

        //把double数转换为Int
        int num = (int) v;
        //System.out.println(num);
//int num = 56;
        //获取中奖的十位数
        int tenValue = num / 10;
        //获取个位数
        int singleValue = num % 10;

        //获取用户输入的数
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入彩票号码：");
        int userNumber = scanner.nextInt();


        //限制获取的数字范围
        if(userNumber >= 10 && userNumber <= 99){

            //获取用户的十位数
            int userTenValue = userNumber / 10;
            //获取用户的个位数
            int userSingleVale = userNumber % 10;

            System.out.println("开奖信息：");
            System.out.println("用户号码："+userNumber);
            System.out.println("中奖号码："+num);

            //检查获得一等奖，数字和顺序一样
             if(userNumber == num){
                System.out.println("恭喜您中一等奖，获得10000美元");
            }else if(userTenValue == singleValue && userSingleVale == tenValue){
                 //检查获得二等奖，数字一样，顺序不一样
                 System.out.println("恭喜您中二等奖，获得3000美元");
             }else if (userTenValue == tenValue || userSingleVale == singleValue){
                 //检查获得三等奖，数字有一个一样（十位比十位，个位比个位）
                 System.out.println("恭喜您中三等奖，获得1000美元");
             }else if(userTenValue == singleValue || userSingleVale == tenValue){
                 //检查获得四等奖，数字有一个一样，顺序不一致，十位比个位，个位比十位
                 System.out.println("恭喜您中四等奖，获得500美元");
             }else {
                 //其他情况都没有中奖
                 System.out.println("很遗憾，您未中奖");
             }

        }else {
            System.out.println("抱歉，数字超过范围【10，99】");
        }
    }


    //6.
    public static void six(){

        Scanner scanner = new Scanner(System.in);
    }


}
