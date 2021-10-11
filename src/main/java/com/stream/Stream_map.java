package com.stream;

import java.util.stream.Stream;

/**
 * @author wq
 * @since 2021-10-11 15:59
 * Stream流
 *   常用方法 map，对数据进行转换（映射到新的流）
 *   参数是Function，传递lambda表示式
 */

public class Stream_map {
    public static void main(String[] args) {
        //创建String 类型的Stream
        Stream<String> stream = Stream.of("1", "2", "3");
        //转换为Integer类型的流
        Stream<Integer> stream1 = stream.map((String s) -> {
            return Integer.parseInt(s);
        });
        //遍历stream1
        stream1.forEach(i->{
            System.out.println(i);
        });
    }

}
