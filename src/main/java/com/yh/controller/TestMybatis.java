package com.yh.controller;

import com.mysql.fabric.Response;
import com.yh.dao.DoorMapper;
import com.yh.pojo.Door;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

/**
 * @author xyb
 * @title: TestMybatis
 * @projectName yhssm
 * @description: TODO
 * @date 2019/9/2615:04
 */
public class TestMybatis {

    public static void main(String[] args) throws Exception{
        //1.读取mybatis-config.xml核心文件
        InputStream in = Resources.getResourceAsStream("mybatis/mybatis-config.xml");
        //2.获取SqlSessionFactory工厂
        SqlSessionFactory session = new SqlSessionFactoryBuilder().build(in);
        //3.获取SqlSession对象
        SqlSession sqlSession = session.openSession();
        //4.获取DoorMapper接口的实例
        DoorMapper mapper = sqlSession.getMapper(DoorMapper.class);
        //5.调用findAll方法查询所有门店信息
        List<Door> list = mapper.findAll();
        //6.遍历所有门店信息
        for (Door a:list
        ){
            System.out.println(a);
        }
    }

}


