package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author wq
 * @since 2021-12-14 9:58
 */

public class InsertTest {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        final String url = "jdbc:mysql://192.168.9.244:3306/wqtest?useUnicode=true&characterEncoding=UTF-8";
        final String name = "com.mysql.jdbc.Driver";
        final String user = "root";
        final String password = "hellowin";

        Connection conn = null;
        Class.forName(name);//指定连接类型
        conn = DriverManager.getConnection(url, user, password);//获取连接
        if (conn!=null) {
            System.out.println("获取连接成功");
            insert(conn);
        }else {
            System.out.println("获取连接失败");
        }

    }
    public static void insert(Connection conn) {

        // 开始时间
        Long begin = System.currentTimeMillis();
        // sql前缀

        String prefix = "INSERT INTO users_copy2 (name,age,phoneNum,id_card) VALUES ";
        try {
            // 保存sql后缀
            StringBuffer suffix = new StringBuffer();
            // 设置事务为非自动提交
            conn.setAutoCommit(false);
            // 比起st，pst会更好些
            PreparedStatement pst = (PreparedStatement) conn.prepareStatement("");//准备执行语句
            // 外层循环，总提交事务次数
            for (int i = 1; i <= 10; i++) {
                suffix = new StringBuffer();
                // 第j次提交步长
                for (int j = 1; j <= 10; j++) {
                    // 构建SQL后缀
                    Object uutil = null;
//                    suffix.append("('"+RandomName.getChineseName()+"','20'"+ ",'女'"+",'138909078888'" +IdCardGenerator.areaCode +"),");

                    //suffix.append("('"+UUID.randomUUID()+"','123456'"+ ",'男'"+",'教师'"+",'www.bbk.com'"+",'XX大学'"+",'"+"2016-08-12 14:43:26"+"','备注'" +"),");
                }
                // 构建完整SQL
                String sql = prefix + suffix.substring(0, suffix.length() - 1);
                // 添加执行SQL
                pst.addBatch(sql);
                // 执行操作
                pst.executeBatch();
                // 提交事务
                conn.commit();
                // 清空上一次添加的数据
                suffix = new StringBuffer();
            }
            // 头等连接
            pst.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        // 结束时间
        Long end = System.currentTimeMillis();
        // 耗时
        System.out.println("数据插入花费时间 : " + (end - begin) / 1000 + " s");
        System.out.println("插入完成");
    }
}

