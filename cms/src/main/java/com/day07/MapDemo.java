package com.day07;

import java.util.HashMap;

/**
 * @author wq
 * @since 2022-05-28 上午10:29
 */

public class MapDemo {
    public static void main(String[] args) {

        HashMap<String,String> map = new HashMap<>();

        map.put("id","1");
        map.put("mobile_phone","13212311232");
        map.put("pwd","12312312");

        boolean key = map.containsKey("mobile_phone");
        if(key == true){
            System.out.println(map.get("mobile_phone"));
        }else {
            System.out.println("没有该键");
        }

        map.replace("pwd", "12312312", "88888888");
        System.out.println(map.get("pwd"));
    }
}
