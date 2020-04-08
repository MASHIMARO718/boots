package com.example.boots.controller;

import com.example.boots.entity.Student;
import com.example.boots.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
@RequestMapping(value = "/user/")
public class UserController {

    @Autowired
    private StudentMapper studentMapper;

    @GetMapping("/hello1")
    @ResponseBody
    public List<Student> test(){
        List<Student> userList;
        userList = studentMapper.selectList(null);
        return userList;
    }
    @RequestMapping(value = "hello2")
    public String test2(){
        return "user/css3.html";
    }
}
