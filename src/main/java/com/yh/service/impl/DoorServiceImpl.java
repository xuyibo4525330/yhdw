package com.yh.service.impl;

import com.yh.dao.DoorMapper;
import com.yh.pojo.Door;
import com.yh.service.DoorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xyb
 * @title: DoorServiceImpl
 * @projectName yhssm
 * @description: TODO
 * @date 2019/9/2615:48
 */
@Service
public class DoorServiceImpl implements DoorService {

    @Autowired
    DoorMapper doorMapper;

    public List<Door> findAll() {
        List<Door> all = doorMapper.findAll();
        return all;
    }
}
