package com.jdbc;

import com.RandomName;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author wq
 * @since 2021-12-13 10:27
 */
//useUnicode=true&characterEncoding=UTF-8    useSSL=false
public class Jdbc_mysql {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    //static final String DB_URL = "jdbc:mysql://192.168.9.244:3306/wqtest?useUnicode=true&characterEncoding=UTF-8";
    static final String DB_URL = "jdbc:mysql://localhost:3306/wqtest?useUnicode=true&characterEncoding=UTF-8";

    // 数据库的用户名与密码，需要根据自己的设置
    static final String USER = "root";
    //static final String PASS = "hellowin";
    static final String PASS = "123456";

    public static void main(String[] args) throws Exception {

        RandomName randomName = new RandomName();

        Connection conn = null;
        Statement stmt = null;
        Class.forName(JDBC_DRIVER);  //驱动
        conn = DriverManager.getConnection(DB_URL,USER,PASS); //获取连接
        stmt = conn.createStatement();  //执行语句

        ResultSet resultSet = stmt.executeQuery("select * from user");
        
        //4.处理数据库的返回结果(使用ResultSet类)
        while(resultSet.next()){
            System.out.println(resultSet.getString("id")+"\t "
                    +resultSet.getString("username")+"\t "
                    +resultSet.getString("birthday")+"\t "
                    +resultSet.getString("address")+" "
            );
        }
    }
}
