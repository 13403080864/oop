package com.mybatis.dao;

import com.mybatis.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
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

public class MybatisTest2 {

    private InputStream in;
    private SqlSession sqlSession;
    private IUserDao userDao;

    @Before
    public void init() throws IOException {
        //1,读取配置文件
        in = Resources.getResourceAsStream("SqlMapConfig.xml");

        //2,获取SqlSessionFactory
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();

        SqlSessionFactory factory = builder.build(in);

        //3,通过SqlSessionFactory获取SqlSession对象
        sqlSession = factory.openSession();

        //4,获取dao的代理对象
        userDao = sqlSession.getMapper(IUserDao.class);

    }

    @After
    public void destroy() throws IOException {

        //5,提交事务
        sqlSession.commit();
        //6,释放资源
        sqlSession.close();
        in.close();

    }

    @Test
    public void testFindAll() throws IOException {

        //5,执行方法（查询所有方法）
        List<User> users = userDao.findAll();

        for (User user : users) {

            System.out.println(user);
        }


    }


    @Test
    public void testSave() throws IOException, ParseException {

        String s = "1990-01-01 10:10:00";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date dat = sdf.parse(s);

        System.out.println(dat);
        User user = new User();

        user.setUsername("幸福里");
        user.setAddress("浙江省杭州市西湖区");
        user.setSex("女");
        user.setBirthday(dat);


            //5,执行方法（查询保存方法）
            userDao.saveUser(user);
            sqlSession.commit();

    }


    @Test
    public void updateUser() throws ParseException {

        String s = "1990-11-01 10:10:00";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date dat = sdf.parse(s);

        User user = new User();

        user.setId(58);
        user.setUsername("小幸运");
        user.setAddress("浙江省杭州市滨江区");
        user.setSex("女");
        user.setBirthday(dat);


        //5,执行方法（查询保存方法）
        userDao.updateUser(user);
    }
}
