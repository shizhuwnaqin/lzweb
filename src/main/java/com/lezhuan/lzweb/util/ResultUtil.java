package com.lezhuan.lzweb.util;

import com.lezhuan.lzweb.response.Result;

/**
 * @Author: yd
 * @Date: 2019/1/7 15:12
 * @Version 1.0
 */
public class ResultUtil {

    //需要出参的,传入返回体出参
    public static <T>Result success(T t){
        Result result = new Result();
        result.setStatus(0);
        result.setMsg("正常处理");
        result.setData(t);
        return result;
    }
}
