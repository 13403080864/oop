package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author wq
 * @since 2021-12-14 10:53
 */

public class Insert {
    //private static String url = "jdbc:mysql://localhost:3306/wqtest?useUnicode=true&characterEncoding=UTF-8";
    private static  String url = "jdbc:mysql://192.168.9.244:3306/wqtest?useUnicode=true&characterEncoding=UTF-8";
    private static String driver = "com.mysql.jdbc.Driver";
    private static String username = "root";
    private static String password = "hellowin";
    //private static String password = "123456";

    public static void main(String[] args) throws Exception {
        IdCardGenerator idCardGenerator=new IdCardGenerator();
        RandomName randomName = new RandomName();
        //query();
        //insert方法
        for(int i=0;i<3;i++){
            String temp="insert into user(username,birthday,sex,address) values('"+RandomName.getChineseName()+"','1990-10-10','女','"+idCardGenerator.generate()+"')";
            insert(temp);
            System.out.println(temp);
        }

    }

    public static void insert(String sql) throws Exception {
        Connection conn = null;
        Statement sta = null;
        Class.forName(driver);
        conn = DriverManager.getConnection(url, username, password);
        sta = conn.createStatement();
        //添加批处理
//        sta.addBatch("insert into user(username,birthday,sex,address) values('小明','1990-10-10','女','浙江省杭州是滨江区')");

        sta.addBatch(sql);


        //执行批处理
        sta.executeBatch();
    }

    public static void query() {
        Connection conn = null;
        Statement sta = null;
        try {
            Class.forName(driver);
            try {
                conn = DriverManager.getConnection(url, username, password);
                String sql = "select * from user";
                sta = conn.prepareStatement(sql);
                ResultSet resultSet = sta.executeQuery(sql);
                while (resultSet.next()) {
                    System.out.println(resultSet.getString("id") + "\t"
                            + resultSet.getString("username"));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (sta != null) {
                try {
                    sta.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
