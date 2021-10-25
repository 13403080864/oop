package com.mybatis.dao;

import com.mybatis.domain.QueryVo;
import com.mybatis.domain.User;

import java.util.List;

/**
 * @author
 * @since 2021-10-24 上午11:59
 * 用户的持久层接口
 */

public interface IUserDao {

    //查询所有

    List<User> findAll();

    //保存用户

    void saveUser(User user);

    //更新用户

    void updateUser(User user);

    //删除用户

    void deleteUser(Integer userId);

    //根据用户ID查询

    User findById(Integer id);

    //模糊查询

    List<User> findByName(String name);

    //查询总条数

    int countUser();

    //用QueryBVo实现模糊查询 ,把对象作为查询条件再次包装 （OGNL表达式）

    List<User> findQueryVo(QueryVo vo);
}
