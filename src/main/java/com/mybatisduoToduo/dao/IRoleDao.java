package com.mybatisduoToduo.dao;

import com.mybatisduoToduo.domain.Role;

import java.util.List;

/**
 * @author wq
 * @since 2021-10-29 14:17
 */

public interface IRoleDao {
    //查询所有
    List<Role> findAll();

    //多对多 查询所有角色对应的用户信息
    List<Role> findAllRole();
}
