package com.data;

import java.util.Calendar;

/**
 * @author wq
 * @since 2021-09-22 14:48
 */

public class Calender02_second {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();  //Calendar 实例化
        int month = calendar.get(Calendar.MONTH);
        int second = calendar.get(Calendar.SECOND);
        //最后输出时，月份需要加1，秒数要判断是否大于9，大于9正常显示，否则秒前加0
        System.out.println((month+1) + "月" + (second > 9?second :"0" + second)+"秒");
        System.out.println("================");
    }
}
