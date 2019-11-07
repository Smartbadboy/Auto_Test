package com.auto_test;

import org.testng.annotations.Test;

public class IgnoreTest {
    @Test
    public  void ignoretest1(){
        System.out.println("ignore1");
    }
    @Test(enabled = false)  //忽略这条用例使用 enabled = false
    public  void ignoretest2(){
        System.out.println("ignore2");
    }
}
