package com.mybatisduoToduo.dao;

import com.mybatisduoToduo.domain.User;

import java.util.List;

/**
 * @author
 * @since 2021-10-24 上午11:59
 * 用户的持久层接口
 */

public interface IUserDao {

    //查询一个用户具备多个角色
    List<User> findAllUser();

}
