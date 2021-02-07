package com.wjx.aphelios.spring.service;

import com.wjx.aphelios.spring.pojo.User;

import java.util.List;

/**
 * @author WJX
 * @since 2018/4/22 21:02
 */
public interface UserService {
    /**
     * 添加用户
     *
     * @param user user实例
     * @return 影响的行数
     */
    Integer add(User user);

    /**
     * @param user user实例
     * @return 影响的行数
     */
    Integer update(User user, Integer id);

    /**
     * @param id user id
     * @return 影响的行数
     */
    Integer deleteById(Integer id);

    /**
     * @return 影响的行数
     */
    Integer deleteAll();

    /**
     * @param id user id
     * @return 影响的行数
     */
    User getUserById(Integer id);

    /**
     * @return 影响的行数
     */
    List<User> getUserList();

    /**
     * @return 影响的行数
     */
    Integer getUserCount();
}
