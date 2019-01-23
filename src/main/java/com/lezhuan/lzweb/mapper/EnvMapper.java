package com.lezhuan.lzweb.mapper;


import com.lezhuan.lzweb.po.Env;

public interface EnvMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Env record);

    int insertSelective(Env record);

    Env selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Env record);

    int updateByPrimaryKey(Env record);
}