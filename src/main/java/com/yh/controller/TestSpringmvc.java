package com.yh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author xyb
 * @title: TestSpringmvc
 * @projectName yhssm
 * @description: TODO
 * @date 2019/9/2614:43
 */
@Controller
public class TestSpringmvc {

    @RequestMapping("/home")
    public String testHome(){
        return "home";
    }

}
