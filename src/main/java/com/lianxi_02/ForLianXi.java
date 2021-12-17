package com.lianxi_02;

/**
 * @author wq
 * @since 2021-12-17 10:38
 */
public class ForLianXi {
    //第一天存1元,以后每天比前一天多存50%，完成下列计算任务
    public static void main(String[] args) {
        //test();
        //test3();
    }
    //1)他存到第几天，当天存的钱会超过10元  7天

    public static void test(){
        double money = 1;
        int day = 1;
        while (money < 10){
            money*=1.5;
            day++;
        }
        System.out.println(day); //7
    }

    //2)一个月（30天）后，他总共存了多少钱
    public static void test2(){

    }

    //2有一个400米一圈的操场，一个人要跑10000米，
    //第一圈50秒，其后每一圈都比前一圈慢1秒，
    //1)按照这个规则计算跑完10000米需要多少秒

    public static int  test3(int x){
        int round = x/400;
        int time = 50;
        int sum = 0;
        for (int i = 0; i < round; i++) {
            sum+=time;
            time++;
           // System.out.println(sum);
        }
        System.out.println(sum);
        return sum;
    }

    //3.用户输入任意一个整数，求各位数字之和
    public static int test4(int... numbers){
       int sum = 0;
       for (int num : numbers){
           sum += num;
       }
        System.out.println(sum);
        return sum;
    }
}
