package com.data;

import java.util.Date;

/**
 * @author wq
 * @since 2021-09-17 15:46
 */

public class Data {
    public static void main(String[] args) {
        data1();
        //data2();
    }
    public static void data3(){

    }
    public static void data2(){
        Date date2 = new Date(1562);
        //获取的是1562秒的时间
        System.out.println(date2); //Thu Jan 01 08:00:01 CST 1970
    }
    public static void data1(){
        Date date = new Date();
        System.out.println(date); //Fri Sep 17 15:57:12 CST 2021 当时的时间
        System.out.println("==============");
        long time = date.getTime();
        System.out.println(time); //1631865072627
    }
}
