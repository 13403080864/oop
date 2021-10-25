package com.mybatis.domain;

/**
 * @author
 * @since 2021-10-25 下午9:46
 *
 * 多个条件作为查询条件  在即进行包装
 */

public class QueryVo {

    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
