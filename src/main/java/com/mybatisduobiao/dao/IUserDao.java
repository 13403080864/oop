package com.mybatisduobiao.dao;

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

    //根据用户ID查询

    User findById(Integer id);

    //模糊查询

    List<User> findByName(String name);

}
