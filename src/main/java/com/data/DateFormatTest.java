package com.data;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author wq
 * @since 2021-09-17 17:41
 */

public class DateFormatTest {
    public static void main(String[] args) {
        format();
    }
    /**
     * 自定义格式,创建子类SimpleDateFormat
     */
    public static void format(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = simpleDateFormat.format(new Date());
        System.out.println(format); //2021-09-17 17:49:00
    }

}
