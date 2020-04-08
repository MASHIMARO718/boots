package com.example.boots.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
* Student 实体类
* Created by jobob on 2019-10-01.
*/
@Data
@TableName("student")
public class Student implements Serializable{

    private static final long serialVersionUID = 1L;
    /**
    * 
    */
    @TableField(value = "id")
    private Integer id;
    /**
    * 
    */
    @TableField(value = "userName")
    private String userName;
    /**
    * 
    */
    @TableField(value = "sex")
    private String sex;
    /**
    * 出生日期
    */
    @TableField(value = "birthYear")
    private String birthYear;
    /**
    * 入学时间
    */
    @TableField(value = "grade")
    private String grade;
    /**
    * 院系id
    */
    @TableField(value = "collegeID")
    private Integer collegeID;
}