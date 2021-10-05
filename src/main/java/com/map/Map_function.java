package com.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author
 * @since 2021-09-25 下午3:55
 */

public class Map_function {

    public static void main(String[] args) {

        //创建对象
        Map<String,String> map = new HashMap<String, String>();

        //添加元素
        map.put("杨过","小龙女");
        map.put("梁山伯","祝英台");
        map.put("贾宝玉","林黛玉");

        System.out.println(map);

        //删除
//        map.remove("杨过");
//        System.out.println(map);

        //判断键对应的值是否存在
        System.out.println(map.containsKey("贾宝玉"));  //true
        System.out.println(map.containsKey("贾新"));  //flase;

        int size = map.size();
        System.out.println(size);   //3

        //根据键找值 Set<k> keySet();
        Set<String> keySet = map.keySet();

        for (String  key: keySet){

            String values = map.get(key);

            System.out.println("key:" + key + "values:" + values );
        }
        System.out.println("===========");


        //获取值
        Collection<String> values = map.values();
        for(String key : values){

            System.out.println( key);
        }

        System.out.println("=====*******======");
        // 获取键值对对象集合
        // Set<Map.Entry<K, V>> entrySet entrySet()
        Set<Map.Entry<String, String>> entries = map.entrySet();

       for (Map.Entry<String, String> me : entries){

           String key = me.getKey();
           String value = me.getValue();
           System.out.println(key + " *** " + value);
       }


    }
}
