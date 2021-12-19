package com.lianxi_02;

import java.util.Random;

/**
 * @author wq
 * @since 2021-12-17 10:38
 *
 * 练习 地址：
 *   https://www.cnblogs.com/hxun/p/11493940.html
 *
 */
public class ForLianXi {
    //第一天存1元,以后每天比前一天多存50%，完成下列计算任务
//    public static void main(String[] args) {
//        //test();
//        //test3();
//    }
    //1)他存到第几天，当天存的钱会超过10元  7天

    public static void test() {
        double money = 1;
        int day = 1;
        while (money < 10) {
            money *= 1.5;
            day++;
        }
        System.out.println(day); //7
    }

    //2)一个月（30天）后，他总共存了多少钱
    public static void test2() {

    }

    //2有一个400米一圈的操场，一个人要跑10000米，
    //第一圈50秒，其后每一圈都比前一圈慢1秒，
    //1)按照这个规则计算跑完10000米需要多少秒

    public static int test3(int x) {
        int round = x / 400;
        int time = 50;
        int sum = 0;
        for (int i = 0; i < round; i++) {
            sum += time;
            time++;
            // System.out.println(sum);
        }
        System.out.println(sum);
        return sum;
    }

    //3.用户输入任意一个整数，求各位数字之和
    public static int test4(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println(sum);
        return sum;
    }


    //4井里有一只蜗牛，他白天往上爬5米，晚上掉3.5米，井深56.7米
    //计算蜗牛需要多少天才能从井底到爬出来
    public static void test5() {
        int day = 1;//天数
        double sum = 0;//爬过的距离
        while (true) {
            //白天向上爬5米
            sum += 5;
            System.out.println("day:" + day + ",sum:" + sum);
            if (sum >= 56.7) {//如果爬出了井
                //退出循环
                break;
            }
            //晚上掉3.5;
            sum -= 3.5;
            day++;
        }
        System.out.println("一共需要的天数为：" + day + " 天");
    }


    //5.定义一个数组int[] nums={8,7,3,9,5,4,1}
    //输出数组中的最大值和最大值所在的下标
    public static void test6() {

        int[] nums = {8, 7, 3, 9, 5, 4, 1};
        int max = nums[0];
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            index = i;

            if (nums[i] > max) {
                max = nums[i];
                System.out.println(max);
                System.out.println(index);
            }

        }
    }


    //6.向一个长度为10的整型数组中随机生成10个0~9的随机整数，完成下列任务
    //1)升序输出、降序输出
    //2)输出总和、平均数

    public static void test7() {

        int[] nums = new int[3];
        Random r = new Random();
        //生成 [m,n] 的数字
        //random.nextInt() * (n-m+1)+m;

        //50-100
        //int i = r.nextInt() * ((10-5+1) + 5);

       /*for (int i = 0; i < nums.length; i++) {
            nums[i] = r.nextInt(50);
        }

        //升序
        Arrays.sort(nums);
        for (int num : nums) {
            System.out.println(num);
        }

        System.out.println("============= 分割 ================");
        //降序
        Arrays.sort(nums);
        for (int j = nums.length -1; j >=0; j-- ) {
            System.out.println(nums[j]);
        }


        System.out.println("============= 总和 分割 ================");
        //总和
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = r.nextInt(10);
            sum+=nums[i];
            System.out.println(nums[i]); //分别打印每个数
        }
        System.out.println(sum);

        System.out.println("============= 平均值 分割 ================");

        */
        //平均值
        float avg = 0;
        float sum = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = r.nextInt(6);
            sum += nums[i];
            avg = (sum / nums.length);
            System.out.println(nums[i]); //分别打印每个数
        }
        System.out.println("sum的总和值：" + sum);
        System.out.println(avg);
    }


    //8.向一个长度为5的整型数组中随机生成5个1-10的随机整数
    // 要求生成的数字中没有重复数

    public static void test8() {

        int[] nums = new int[5];
        Random ran = new Random();

        for (int i = 0; i < nums.length; i++) {
            nums[i] = ran.nextInt(10) + 1;

            for (int j = 0; j < i; j++) {
                //while (nums[i] == nums[j]) {//如果重复，退回去重新生成随机数
                if (nums[i] == nums[j]) { //也可已 去重复的
                    i--;
                }
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }


    //一个长度为10的整型数组中随机生成10个0~9的随机整数，完成下列任务
//1)统计每个数字出现了多少次
//2)输出出现次数最多的数字
//3)输出只出现一次的数字中最小的数字


    public static void main(String[] args) {
        //test();
        //test8();
        test9();


    }

    public static void test9() {

        int[] arrs = new int[5];
        Random random = new Random();

        //给定数组存重复的值
        int[] count = new int[5];

        for (int i = 0; i < arrs.length; i++) {

            arrs[i] = random.nextInt(10);
            System.out.print(arrs[i]+" ");

            for (int j = 0; j < i; j++) {
                if(arrs[j] == arrs[i]){
                    count[i]++;
                }

            }
            System.out.println("count数组："+count[i]);

        }

        System.out.println("========");
        for (int j = 0;j<count.length;j++) {
            System.out.println("数字"+count[j]+"出现次数"+j);
        }
        //System.out.print(arrs[i]);
    }
}





