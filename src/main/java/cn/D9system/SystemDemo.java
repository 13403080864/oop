package cn.D9system;

import java.util.Properties;

/**
 * @author wq
 * @since 2022-03-16 下午9:33
 */

public class SystemDemo {

    public static void main(String[] args) {

        long l = System.currentTimeMillis();

        System.out.println(l);

        Properties properties = System.getProperties();

        System.out.println(properties);

    }
}
