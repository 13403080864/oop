package com.mybatis;

import com.mybatis.dao.IUserDao;
import com.mybatis.domain.QueryVo;
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
 * @author wq
 * @since 2021-10-26 11:18
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

        user.setId(59);
        user.setUsername("Luck");
        user.setAddress("浙江省杭州市滨江区");
        user.setSex("女");
        user.setBirthday(dat);


        //5,执行方法（更新方法）
        userDao.updateUser(user);
    }

    @Test

    public void deleteUser(){

        userDao.deleteUser(59);
    }

    @Test
    //根据id查询用户信息
    public void findById(){

        User user = userDao.findById(41);
        System.out.println(user);
    }

    @Test
    //根据姓名模糊查询
    public void testFindByName(){

        List<User> users = userDao.findByName("%王%");

        for(User user : users){

            System.out.println(user);
        }

    }

    @Test
    //查询用户记录总数
    public void testCountUser(){

        int count = userDao.countUser();
        System.out.println(count);
    }


    @Test
    //(实体类user包装作为查询的条件） 实现模糊查询
    public void testFindQueryVo(){

        QueryVo vo = new QueryVo();

        User user = new User();

        user.setUsername("%王%");

        vo.setUser(user);

        List<User> users = userDao.findQueryVo(vo);

        for(User u : users){

            System.out.println(u);
        }

    }

}
