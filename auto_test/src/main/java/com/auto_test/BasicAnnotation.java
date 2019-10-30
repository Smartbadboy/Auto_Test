package com.auto_test;

import org.testng.annotations.*;

public class BasicAnnotation {
    @Test
    public void testCase1(){
        System.out.println("测试用例1");
    }
    @Test
    public void testCase2(){
        System.out.println("测试用例2");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("测试前准备方法");
    }
    @AfterMethod
    public void AfterMethod(){
        System.out.println("测试后方法");
    }
    @BeforeClass
    public void BeforeClass(){
        System.out.println("类运行之前的方法");
    }
    @AfterClass
    public void AfterClass(){
        System.out.println("类运行之后的方法");
    }
    @BeforeSuite

    
    public void BeforeSuite(){
        System.out.println("测试套件前");
    }
    @AfterSuite
    public void AfterSuite(){
        System.out.println("测试套件后222");
    }
}
