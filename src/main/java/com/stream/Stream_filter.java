package com.stream;

import java.util.stream.Stream;

/**
 * @author wq
 * @since 2021-10-11 15:38
 * Stream流
 *  常用方法 filter,对数过滤
 * filter方法参数是Predicate 是一个函数式接口，所以可以传递lambda表达式对数据进行过滤
 * Stream流只能使用一次
 */

public class Stream_filter {
    public static void main(String[] args) {
        //创建流，可以创建集合（单列集合），也可以用Stream.of
        Stream<String> stream = Stream.of("张三", "李四", "张无忌", "张三封");
        //Stream流用方法 filter过滤
        Stream<String> stream1 = stream.filter((name) -> {
            return name.startsWith("张");
        });

        //遍历stream1,用lambda表达式
        stream1.forEach((name)->{
            System.out.println(name);
        });
    }
}
