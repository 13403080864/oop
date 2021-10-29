package com.mybatis_duobiaoTest.dao;

import com.mybatisduobiao.dao.IAccountDao;
import com.mybatisduobiao.domain.Account;
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
 * @author wq
 * @since 2021-10-28 19:05
 */

public class MybatisDuobiaoTest {
    private InputStream in;
    private SqlSession sqlSession;
    private IAccountDao accountDao;

    @Before
    public void init() throws IOException {
        //1,读取配置文件
        in = Resources.getResourceAsStream("SqlDuobiao.xml");

        //2,获取SqlSessionFactory
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();

        SqlSessionFactory factory = builder.build(in);

        //3,通过SqlSessionFactory获取SqlSession对象
        sqlSession = factory.openSession(true);

        //4,获取dao的代理对象
        accountDao = sqlSession.getMapper(IAccountDao.class);

    }

    @After
    public void destroy() throws IOException {

//        //5,提交事务
//        sqlSession.commit();
        //6,释放资源
        sqlSession.close();
        in.close();

    }

    /**
     * testFindAll()
     *     单表操作，查询所有账户信息
     */
    @Test
    public void testFindAll(){
        List<Account> accounts = accountDao.findAll();
        for (Account account : accounts){
            System.out.println(account);
            System.out.println(account.getUser());
        }
    }

    /**
     * testFindAllAccount()
     *     多表操作，查询所有账户信息，同事包含用户的姓名和地址的信息
     */
    @Test
    public void testFindAllAccount(){
        List<Account> us = accountDao.findAllAccount();
        for(Account u : us){
            System.out.println(u);
            System.out.println(u.getUser());
        }
    }
}
