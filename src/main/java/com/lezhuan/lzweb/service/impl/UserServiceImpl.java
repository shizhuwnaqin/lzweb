package com.lezhuan.lzweb.service.impl;

import com.lezhuan.lzweb.mapper.UserMapper;
import com.lezhuan.lzweb.po.User;
import com.lezhuan.lzweb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: yd
 * @Date: 2019/1/2 14:13
 * @Version 1.0
 */
@Service
public class UserServiceImpl implements UserService {
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    UserMapper userMapper;

    @Override
    public User selectOne(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<User> selectAll() {
        return userMapper.selectAll();
    }
}
