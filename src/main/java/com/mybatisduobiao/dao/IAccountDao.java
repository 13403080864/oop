package com.mybatisduobiao.dao;

import com.mybatisduobiao.domain.Account;

import java.util.List;

/**
 * @author wq
 * @since 2021-10-28 18:58
 */

public interface IAccountDao {
    //查询所有账户
    List<Account> findAll();

    //查询所有账户 并包含用户信息的姓名和地址
    List<Account> findAllAccount();
}
