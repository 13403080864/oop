package com.mybatis;

import com.mybatis.dao.IUserDao;
import com.mybatis.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author wq
 * @since 2021-10-21 17:32
 */

public class MybatisTest {
    public static void main(String[] args) throws IOException {
        //1，读取配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");

        //2，创建SqlSessionFactory工厂  由于SqlSessionFactory是接口，不能之久new，mybatis提供了SqlSessionFactoryBuilder
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory build = builder.build(in);

        //3，使用工厂生产SqlSession对象
        SqlSession session = build.openSession();

        //4,使用SqlSession创建Dao接口的代理对象
        IUserDao userDao = session.getMapper(IUserDao.class);

        //5,使用代理执行方法
        List<User> users = userDao.findAll();
        for(User user : users){
            System.out.println(user);
        }
        //6,释放资源
        session.commit();
        session.close();
        in.close();
    }
}
