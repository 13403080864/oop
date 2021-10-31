package com.mabytisduoToduoTest.dao;

import com.mybatisduoToduo.dao.IRoleDao;
import com.mybatisduoToduo.dao.IUserDao;
import com.mybatisduoToduo.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author
 * @since 2021-10-31 下午3:24
 */

//多对多，一个用户对应多个角色
public class UserTest {

    private InputStream in;
    private SqlSession sqlSession;
    private IUserDao userDaoDao;

    @Before
    public void init() throws IOException {
        //1,读取配置文件
        in = Resources.getResourceAsStream("SqlDuoToDuo.xml");

        //2,获取SqlSessionFactory
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();

        SqlSessionFactory factory = builder.build(in);

        //3,通过SqlSessionFactory获取SqlSession对象
        sqlSession = factory.openSession(true);

        //4,获取dao的代理对象
        userDaoDao = sqlSession.getMapper(IUserDao.class);

    }

    @After
    public void destroy() throws IOException {

//        //5,提交事务
//        sqlSession.commit();
        //6,释放资源
        sqlSession.close();
        in.close();

    }

    @Test
    public void testFindAllUser(){

        List<User> users = userDaoDao.findAllUser();

        for(User user : users){

            System.out.println(user);

            System.out.println(user.getRoles());

        }
    }
}
