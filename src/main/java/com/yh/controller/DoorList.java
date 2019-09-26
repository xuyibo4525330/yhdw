package com.yh.controller;

import com.yh.pojo.Door;
import com.yh.service.DoorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author xyb
 * @title: DoorController
 * @projectName yhssm
 * @description: TODO
 * @date 2019/9/2615:49
 */
@Controller
public class DoorList {

    @Autowired
    DoorService doorService;

    @RequestMapping("/doorList")
    public String doorList(Model model){
        List<Door> list = doorService.findAll();
        for (Door d:list
             ) {
            System.out.println(d);
        }
        //存入Model
        model.addAttribute("list",list);
        return "door_list";
    }

    @RequestMapping("/index")
    public String getIndex(){
        return "index";
    }


}
