package com.example.springboothelloworld.service;

import com.example.springboothelloworld.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class UserServiceTest {
    @Autowired
    //可直接注入UserService这个组件
    private UserService userService;

    /*使用slf4j接口下的Logger，从LoggerFactory工厂中获取一个logger，该logger的名称（类叫什么名字，该logger就叫什么名称）
Logger logger = LoggerFactory.getLogger(UserService.class);
*/
    @Test
    public void test_logging() {
        //先执行拼接字符串，之后判断日志输出级别，决定是否执行该语句，造成不必要的资源浪费。
        String str = "sdf";
   /* //打印一个debug级别的输出
    logger.debug("您输入的是："+ str);
    //解决：使用{}占位符，类似于模板字符串,不会拼接字符串
    logger.debug("输入的是{}{}",str,str);*/

        //因使用了@Slf4j注解，可直接调用日志对象
        log.debug("输入的是{}{}", str, str);

    }

    @Test
    public void test_user(){
        User user = new User("cyc","山西省");
        log.debug(user.getName());
        //使用了@Data注解，重写了toString()方法，把user中属性值拼接
        log.debug(user.toString());

    }

    @Test
    @DisplayName("输入1+1，预期2")
    public void test_add() {
        //这是黑盒测试，应该写断言，不应该打输出
        //该断言方法第一个参数为预期结果，第二个参数为实际调用方法产生结果(前置条件)
        Assertions.assertEquals(2, userService.add(1, 1));
    }

    @Test
    public void test_addString() {
        //预期出现异常
        Assertions.assertThrows(Exception.class, () -> {
            userService.addString("cyc");
        });
    }
}
