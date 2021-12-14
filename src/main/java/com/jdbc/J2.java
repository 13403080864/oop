package com.jdbc;

import java.io.InputStream;
import java.util.Properties;

/**
 * @author wq
 * @since 2021-12-13 17:18
 */

public class J2 {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        InputStream inputStream = J2.class.getResourceAsStream("db.properties");

        System.out.println(properties.getProperty("username"));
    }
}