package com.yh.controller;

import com.yh.pojo.Door;
import com.yh.service.DoorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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

    /**
    * @Title:添加门店
    * @author xyb
    * @date 2019/9/27 15:47
    */
    @RequestMapping("/doorAdd")
    public String doorAdd(Door door,RedirectAttributes redirectAttributes){
        int row = doorService.doorAdd(door);
        redirectAttributes.addAttribute("param", row);
        return "redirect:doorList";
    }

    /**
    * @Title:删除门店
    * @author xyb
    * @date 2019/9/27 15:50
    */
    @RequestMapping("/doorDelete")
    public String doorDelete(Integer id,RedirectAttributes redirectAttributes){
        int row = doorService.doorDelete(id);
        redirectAttributes.addAttribute("param", row);
        return "redirect:doorList";
    }

    /**
    * @Title: 修改门店
    * @author xyb
    * @date 2019/9/27 16:23
    */
    @RequestMapping("/doorInfo")
    public String doorInfo(Integer id,Model model){
        //根据Id查询门店信息回显
        Door door = doorService.doorSelectOne(id);
        model.addAttribute("door",door);
        return "door_update";
    }
}
