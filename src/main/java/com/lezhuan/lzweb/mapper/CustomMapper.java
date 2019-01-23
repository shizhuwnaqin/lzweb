package com.lezhuan.lzweb.mapper;

import com.lezhuan.lzweb.po.Custom;

public interface CustomMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Custom record);

    int insertSelective(Custom record);

    Custom selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Custom record);

    int updateByPrimaryKey(Custom record);
}