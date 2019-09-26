package com.yh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author xyb
 * @title: PageController
 * @projectName yhssm
 * @description: TODO
 * @date 2019/9/2615:59
 */
@Controller
public class PageController {

    @RequestMapping("/{page}")
    public String page(@PathVariable String page){
        return page;
    }

}

