package com.yh.service;

import com.yh.dao.DoorMapper;
import com.yh.pojo.Door;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author xyb
 * @title: DoorService
 * @projectName yhssm
 * @description: TODO
 * @date 2019/9/2615:45
 */
public interface DoorService {

    public List<Door> findAll();

    public int doorAdd(Door door);

    /**
    * @Title: 删除门店
    * @author xyb
    * @date 2019/9/27 16:00
    */
    public int doorDelete(Integer id);

    /**
    * @Title: 基于ID查询门店信息
    * @author xyb
    * @date 2019/9/27 16:25
    */
    Door doorSelectOne(Integer id);
}
