package com.yh.dao;

import com.yh.pojo.Door;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author xyb
 * @title: DoorMapper
 * @projectName yhssm
 * @description: TODO
 * @date 2019/9/2615:02
 */
public interface DoorMapper {

    /**
    * @Title: 查询总门店
    * @author xyb
    * @date 2019/9/27 11:38
    */
    public List<Door> findAll();

    /**
    * @Title: 添加门店信息
    * @author xyb
    * @date 2019/9/27 11:38
    */
    public int doorAdd(Door door);

    /**
    * @Title:删除门店
    * @author xyb
    * @date 2019/9/27 16:04
    */
    public int doorDelete(Integer id);

    /**
    * @Title: 基于Id查询门店信息
    * @author xyb
    * @date 2019/9/27 16:26
    */
    Door doorSelectOne(Integer id);
}
