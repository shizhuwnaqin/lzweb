package com.lezhuan.lzweb.controller;

import com.lezhuan.lzweb.po.User;
import com.lezhuan.lzweb.service.UserService;
import com.lezhuan.lzweb.util.ResultUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: yd
 * @Date: 2019/1/2 14:20
 * @Version 1.0
 */
@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/selectOne")
    public Object selectOne(Integer id){
        log.info("测试————————");
//        return userService.selectOne(id);
        return ResultUtil.success(userService.selectOne(id));
    }

    @RequestMapping("/selectAll")
    public List<User> selectAll(){
        return userService.selectAll();
    }
}
