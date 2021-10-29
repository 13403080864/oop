package com.mybatis2.dao.impl;

import com.mybatis2.domain.User;
import com.mybatis2.dao.IUserDao;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

/**
 * @author wq
 * @since 2021-10-26 14:30
 */

public class UserDaoImpl implements IUserDao {
    private SqlSessionFactory factory;

    public UserDaoImpl(SqlSessionFactory factory) {
        this.factory = factory;
    }

    @Override
    public List<User> findAll() {
        //1,根据factory 获取SqlSession对象
        SqlSession sqlSession = factory.openSession();

        //2,调用SqlSession方法，查询列表
        List<User> users = sqlSession.selectList("com.mybatis2.dao.IUserDao.findAll");
        sqlSession.close();
        return users;
    }

    @Override
    public void saveUser(User user) {
        //1,根据factory 获取SqlSession对象
        //SqlSession sqlSession = factory.openSession(true);

        //自动提交 设置为true
        SqlSession sqlSession = factory.openSession(true);

        //2,调用SqlSession方法，查询列表
        int u = sqlSession.insert("com.mybatis2.dao.IUserDao.saveUser",user);
//        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public void updateUser(User user) {
        //1,根据factory 获取SqlSession对象
        SqlSession sqlSession = factory.openSession();

        //2,调用SqlSession方法，更新数据
        sqlSession.update("com.mybatis2.dao.IUserDao.updateUser",user);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public void deleteUser(Integer userId) {
        //1,根据factory 获取SqlSession对象
        SqlSession sqlSession = factory.openSession();

        //2,调用SqlSession方法，删除用户
        sqlSession.delete("com.mybatis2.dao.IUserDao.deleteUser",userId);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public User findById(Integer id) {
        //1,根据factory 获取SqlSession对象
        SqlSession sqlSession = factory.openSession();

        //2,调用SqlSession方法，查询列表
        User user = sqlSession.selectOne("com.mybatis2.dao.IUserDao.findById",id);
        sqlSession.close();
        return user;
    }

    @Override
    public List<User> findByName(String name) {
        //1,根据factory 获取SqlSession对象
        SqlSession sqlSession = factory.openSession();

        //2,调用SqlSession方法，查询列表
        List<User> users = sqlSession.selectList("com.mybatis2.dao.IUserDao.findByName", name);
        sqlSession.close();
        return users;
    }

    @Override
    public int countUser() {
        //1,根据factory 获取SqlSession对象
        SqlSession sqlSession = factory.openSession();

        //2,调用SqlSession方法，查询列表
        Integer in = sqlSession.selectOne("com.mybatis2.dao.IUserDao.countUser");
        sqlSession.close();
        return in;
    }
}
