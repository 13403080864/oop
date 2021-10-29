package com.mybatis2.dao;

import com.mybatis2.dao.impl.UserDaoImpl;
import com.mybatis2.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

/**
 * @author wq
 * @since 2021-10-27 10:19
 */

public class ImplTest {

    private InputStream in;
    private IUserDao userDao;

    @Before
    public void init() throws IOException {
        //1,读取配置文件
        in = Resources.getResourceAsStream("SqlMapConfig.xml");

        //2,获取SqlSessionFactory
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();

        SqlSessionFactory factory = builder.build(in);

        //3,使用工厂创建dao对象
        userDao = new UserDaoImpl(factory);

    }

    @After
    public void destroy() throws IOException {

        //6,释放资源
        in.close();

    }

    @Test
    public void testFindAll() {

        //5,执行方法（查询所有方法）
        List<User> users = userDao.findAll();
        for (User user : users) {

            System.out.println(user);
        }

    }

    @Test
    public void testSaveUser(){
        User user = new User();
        user.setUsername("小星星");
        user.setBirthday(new Date());
        user.setSex("女");
        user.setAddress("湖北省武汉市武昌区");
        userDao.saveUser(user);
        System.out.println(user);
    }

    @Test
    public void testUpdateUser(){
       User user = new User();

        user.setId(41);
        user.setUsername("Luck");
        user.setAddress("浙江省杭州市滨江区");
        user.setSex("女");
        user.setBirthday(new Date());

        userDao.updateUser(user);
    }

    @Test
    public void deleteUser(){

        userDao.deleteUser(51);
    }

    @Test
    public  void  testFindOne(){
        User user = userDao.findById(48);
        System.out.println(user);
    }

    @Test
    public void testFindByName(){
        List<User> users = userDao.findByName("%王%");
        for(User user : users){
            System.out.println(user);
        }
    }

    @Test
    public void testCountUser(){
        int i = userDao.countUser();
        System.out.println(i);
    }
}
