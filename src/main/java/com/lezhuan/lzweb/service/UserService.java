package com.lezhuan.lzweb.service;

import com.lezhuan.lzweb.po.User;

import java.util.List;

/**
 * @Author: yd
 * @Date: 2019/1/2 14:11
 * @Version 1.0
 */
public interface UserService {
    User selectOne(Integer id);

    List<User> selectAll();
}
