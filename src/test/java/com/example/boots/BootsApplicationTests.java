package com.example.boots;

import com.example.boots.entity.Student;
import com.example.boots.entity.User;
import com.example.boots.mapper.StudentMapper;
import com.example.boots.mapper.UserMapper;
import com.example.boots.utils.RedisUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BootsApplicationTests {
    @Test
    public void contextLoads() {
    }
    @Autowired
    public RedisUtil redisUtil;
    @Autowired
    private StudentMapper studentMapper;

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<Student> userList = studentMapper.selectStudentList();
        Map<String,Object> map = new HashMap<>();
        map.put("stau",userList);
        Boolean t = redisUtil.hmset("123",map,60);
        System.out.println(t);
    }
}
