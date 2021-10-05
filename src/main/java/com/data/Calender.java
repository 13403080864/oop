package com.data;

import java.util.Calendar;

/**
 * @author wq
 * @since 2021-09-17 16:39
 */

public class Calender {
    public static void main(String[] args) {
//        Calendar calendar = Calendar.getInstance();
//        calenderGet(calendar);
        //calenderSet(); //2021年8月17日5时11分43秒

        calenderAdd();
    }

    /**
     * add设置日历的偏移
     */
    public static void calenderAdd(){
        Calendar calendar = Calendar.getInstance();  //获取当前时间
        calendar.add(Calendar.MONTH,2);   //向后偏移2个月
        calenderGet(calendar);  //调用calenderGet 可以验证是否正确 结果：2021年11月17日5时23分48秒
    }
    public static void calenderSet(){
        Calendar calendar = Calendar.getInstance();
        //calendar.set(2021,7,17);
       calendar.set(Calendar.DAY_OF_MONTH,30);
        calenderGet(calendar);

    }
    public static void calenderGet(Calendar calendar){

        System.out.println(calendar.get(Calendar.YEAR) + "年" + (calendar.get(Calendar.MARCH) + 1) + "月" +
                calendar.get(Calendar.DATE) + "日" + calendar.get(Calendar.HOUR) + "时"+ calendar.get(Calendar.MINUTE)+
                "分" + calendar.get(Calendar.SECOND) + "秒");
    }
}
