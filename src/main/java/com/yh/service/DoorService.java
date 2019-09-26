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

}
