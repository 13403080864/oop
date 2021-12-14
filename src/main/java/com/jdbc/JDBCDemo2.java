package com.jdbc;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;


/**
 * @author wq
 * @since 2021-10-20 14:26
 */

public class JDBCDemo2 {
    private static  String driver ;
    private static String url;
    private static String username;
    private static String password;


    public static void main(String[] args) throws Exception {
        Connection conn = null;
        Statement stmt = null;

        // 可以帮助读取和处理资源文件中的信息
        Properties pros = new Properties();
        InputStream stream = JDBCDemo2.class.getClassLoader().getResourceAsStream("F:\\project\\oop\\src\\main\\resources\\db.properties");
        pros.load(stream);
        // 加载驱动
            Class.forName(pros.getProperty("driver"));
            // 连接数据库
            conn = DriverManager.getConnection(pros.getProperty("url"), pros.getProperty("username"), pros.getProperty("password"));
            stmt = conn.createStatement();
            ResultSet resultSet = stmt.executeQuery("select  * from user");
            while (resultSet.next()){
                System.out.println(resultSet.getString("id"));
            }


    }

}
