package com.example.springboothelloworld.util;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

//这一个普通的工具类，不需要使用Spring，故不需要加spring的那个注解
public class MyUtilsTest {
    @Test
    @DisplayName("输入1+1，预期2")
    public void test_add(){
        //这是黑盒测试，应该写断言，不应该打输出
        //该断言方法第一个参数为预期结果，第二个参数为实际调用方法产生结果
        Assertions.assertEquals(2,MyUtils.add(1,1));
    }
}
