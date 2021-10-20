package com.jdbc;

import java.io.File;
import java.io.FileInputStream;
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
    private static String driver;
    private static String url;
    private static String username;
    private static String password;

    public static void main(String[] args) throws Exception {
        InputStream stream = JDBCDemo2.class.getClassLoader().getResourceAsStream("db.properties");
        Properties pro = new Properties();
        pro.load(stream);

        String driver = pro.getProperty("driver");
        Class.forName(driver);
        String url = pro.getProperty("url");
        String username = pro.getProperty("username");
        String password = pro.getProperty("password");

        Connection conn = DriverManager.getConnection(url, username, password);
        Statement statement = conn.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from user");
        System.out.println(resultSet);
        //Properties properties = new Properties("db.properties");
        //String driver="";
    }

}
