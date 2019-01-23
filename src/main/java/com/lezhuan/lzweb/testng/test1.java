package com.lezhuan.lzweb.testng;

import lombok.extern.slf4j.Slf4j;

import javax.lang.model.element.NestingKind;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author: yd
 * @Date: 2018/12/25 17:38
 * @Version 1.0
 */
@Slf4j
public class test1  {

    public static void main(String args[]) {

        String out = "out";
        List<String> list = Arrays.asList("b","a","c","a");

        List t = list.stream().map(x->{String in ="in"; return out+in+x;}).
                collect(Collectors.toList());
        System.out.println(t);
        System.out.println("test");
    }
}


