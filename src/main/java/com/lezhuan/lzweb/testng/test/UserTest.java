package com.lezhuan.lzweb.testng.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

/**
 * @Author: yd
 * @Date: 2019/1/10 11:16
 * @Version 1.0
 */
public class UserTest {

    @DataProvider(name="pro")
    public Object[] detapro(){
//        System.out.println(method.getName());

        Object[] a = new Object[1];
        a[0] = 1;
        return a;
    }


    @Test(dataProvider = "pro")
    public void test1(int s){
        System.out.println(s);
    }

}
