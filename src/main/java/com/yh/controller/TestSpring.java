package com.yh.controller;

import com.yh.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

/**
 * @author xyb
 * @title: TestSpring
 * @projectName yhssm
 * @description: TODO
 * @date 2019/9/2611:41
 */
/** 测试类：测试spring开发环境的类 */
public class TestSpring {
    @Test
    public void testSpring(){
        //1.加载Spring的核心配置文件
        ClassPathXmlApplicationContext ac =
                new ClassPathXmlApplicationContext(
                        "spring/applicationContext.xml");
        //2.获取bean实例
        User user = (User) ac.getBean("user");
        System.out.println(user);
    }
}

