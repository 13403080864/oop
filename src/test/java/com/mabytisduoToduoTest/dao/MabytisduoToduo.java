package com.mabytisduoToduoTest.dao;

import com.mybatisduoToduo.dao.IRoleDao;
import com.mybatisduoToduo.domain.Role;
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
 * @author wq
 * @since 2021-10-29 17:02
 */

public class MabytisduoToduo {
    private InputStream in;
    private SqlSession sqlSession;
    private IRoleDao roleDao;

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
        roleDao = sqlSession.getMapper(IRoleDao.class);

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
    public void testFindAll(){
        List<Role> roles = roleDao.findAll();
        for(Role role : roles){
            System.out.println(role);
        }
    }


    //多对多 查询角色对应的用户信息
    @Test
    public void testFindAllRole(){
        List<Role> roles = roleDao.findAllRole();
        for(Role role : roles){
            System.out.println(role );
            System.out.println(role.getUsers());
        }
    }

}
