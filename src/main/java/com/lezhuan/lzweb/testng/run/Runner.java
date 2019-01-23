package com.lezhuan.lzweb.testng.run;

import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: yd
 * @Date: 2019/1/11 9:44
 * @Version 1.0
 */
public class Runner {

    public static void main(String args[]){
        XmlSuite suite = new XmlSuite();
        suite.setName("UserSuite");

        XmlTest test = new XmlTest(suite);
        test.setName("UserTest");

        List<XmlClass> classes = new ArrayList<XmlClass>();
        classes.add(new XmlClass("com.lezhuan.lzweb.testng.test.UserTest"));
        test.setXmlClasses(classes) ;

        List<XmlSuite> suites = new ArrayList<XmlSuite>();
        suites.add(suite);
        TestNG tng = new TestNG();
        tng.setXmlSuites(suites);
        tng.run();

    }




}
