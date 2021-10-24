package com.mybatis.dao;

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
}
