package com.auto_test.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class SuiteConfig {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("开始运行Suite");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("运行结束Suite");
    }
}
