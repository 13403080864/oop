package com.mybatis.dao;

import com.mybatis.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author
 * @since 2021-10-24 下午12:14
 */

public class MybatisTest {

    @Test
    public void testFindAll() throws IOException {

        //1,读取配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");

        //2,获取SqlSessionFactory
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();

        SqlSessionFactory factory = builder.build(in);

        //3,通过SqlSessionFactory获取SqlSession对象
        SqlSession sqlSession = factory.openSession();

        //4,获取dao的代理对象
        IUserDao userDao = sqlSession.getMapper(IUserDao.class);

        //5,执行方法（查询所有方法）
        List<User> users = userDao.findAll();

        for (User user : users) {

            System.out.println(user);
        }

        //6,释放资源
        sqlSession.close();
        in.close();

    }


    @Test

    public void testSave() throws IOException, ParseException {

        String s = "1990-01-01";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date dat = sdf.parse(s);

        System.out.println(dat);
        User user = new User();

        user.setUsername("mybatis");
        user.setAddress("浙江省杭州市");
        user.setSex("男");
        user.setBirthday(dat);
        InputStream in = null;
        SqlSession sqlSession = null;


        try {
            //1,读取配置文件
            in = Resources.getResourceAsStream("SqlMapConfig.xml");

            //2,获取SqlSessionFactory
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();

            SqlSessionFactory factory = builder.build(in);

            //3,通过SqlSessionFactory获取SqlSession对象
            sqlSession = factory.openSession();

            //4,获取dao的代理对象
            IUserDao userDao = sqlSession.getMapper(IUserDao.class);

            //5,执行方法（查询保存方法）
            userDao.saveUser(user);
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }

        //6,释放资源
        sqlSession.close();
        in.close();


    }
}
