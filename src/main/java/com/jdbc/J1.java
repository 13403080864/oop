//package com.jdbc;
//
//import java.io.InputStream;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.util.Properties;
//
///**
// * @author wq
// * @since 2021-12-13 15:12
// */
//
//public class J1 {
//    public static void main(String[] args) throws Exception {
//        QueryEmp();
//    }
//
//     public static void QueryEmp() throws Exception {
//                 Connection conn = null;
//                 PreparedStatement ps = null;
//                 ResultSet rs = null;
//                 // 配置文件路径
//                 //String configFile = "F:\\project\\oop\\src\\main\\resources\\db.properties";
//                 // 创建一个Properties对象
//                 Properties prop = new Properties();
//                 // 将Properties配置文件 读入输入流
//                 // 读取Properties配置文件的方法有6种
//         InputStream in  = J1.class.getClassLoader().getResourceAsStream("db.properties");
//         prop.load(in);
//
//                 String driver = prop.getProperty("driver");
//                 String url = prop.getProperty("url");
//                 String name = prop.getProperty("name");
//                 String password = prop.getProperty("password");
//
//
//                         // 加载JDBC驱动
//                         Class.forName(driver);
//            // 获取连接 链接数据库
//                         conn = DriverManager.getConnection(url, name, password);
//                         String sql = "select * from user";
//                         // 获取Statement对象，来写SQL语句
//                         ps = conn.prepareStatement(sql);
//                         // 执行SQL语句，获取结果集
//                         rs = ps.executeQuery();
//                         while (rs.next()) {
//                             System.out.println(rs.getString("id")+"\t "
//                                     +rs.getString("username")+"\t "
//                                     +rs.getString("birthday")+" "
//                                     +rs.getString("address")+" ");
//
//
//                             }
//         //关闭资源
//         rs.close();
//         ps.close();
//         conn.close();
//
//}
//}
