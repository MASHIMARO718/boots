package com.example.boots.controller;

import com.example.boots.entity.Student;
import com.example.boots.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 *
 * @Description 
 *
 * @author  19057312
 * @date  2019/10/1 11:08
 * @version 1.0.0
 */
@Controller
@RequestMapping("/boots/")
public class UserController {

    @Autowired
    private StudentMapper studentMapper;

    @RequestMapping("hello")
    public void test(){
        List<Student> userList = studentMapper.selectList(null);
        System.out.println(userList);
    }
}
