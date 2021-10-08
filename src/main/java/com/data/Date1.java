package com.data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author wq
 * @since 2021-09-22 11:03
 */

public class Date1 {
    public static void main(String[] args) throws ParseException {

        //Date转换为String
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        String str = simpleDateFormat.format(date);
        System.out.println(str);  //2021年09月22日 11时41分55秒

        System.out.println("==================");

        //String转换为Date
        String s = "2021-09-22 11:41:55";
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parse = simpleDateFormat2.parse(s);
        System.out.println(parse);

    }
}
