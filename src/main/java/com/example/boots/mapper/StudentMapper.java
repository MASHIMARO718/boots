package com.example.boots.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.boots.entity.Student;
import com.example.boots.entity.User;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 *
 * @Description 
 *
 * @author  19057312
 * @date  2019/10/1 11:10
 * @version 1.0.0
 */
@Component
public interface StudentMapper extends BaseMapper<Student> {

    List<Student> selectStudentList();

}
