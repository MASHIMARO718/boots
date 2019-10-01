package com.example.boots.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.sql.Blob;

/**
* User 实体类
* Created by jobob on 2019-10-01.
*/
@Data
@TableName("user")
public class User implements Serializable{

    private static final long serialVersionUID = 1L;
    /**
    * 
    */
    private String Host;
    /**
    * 
    */
    private String User;
    /**
    * 
    */
    private String Password;
    /**
    * 
    */
    private String selectPriv;
    /**
    * 
    */
    private String insertPriv;
    /**
    * 
    */
    private String updatePriv;
    /**
    * 
    */
    private String deletePriv;
    /**
    * 
    */
    private String createPriv;
    /**
    * 
    */
    private String dropPriv;
    /**
    * 
    */
    private String reloadPriv;
    /**
    * 
    */
    private String shutdownPriv;
    /**
    * 
    */
    private String processPriv;
    /**
    * 
    */
    private String filePriv;
    /**
    * 
    */
    private String grantPriv;
    /**
    * 
    */
    private String referencesPriv;
    /**
    * 
    */
    private String indexPriv;
    /**
    * 
    */
    private String alterPriv;
    /**
    * 
    */
    private String showDbPriv;
    /**
    * 
    */
    private String superPriv;
    /**
    * 
    */
    private String createTmpTablePriv;
    /**
    * 
    */
    private String lockTablesPriv;
    /**
    * 
    */
    private String executePriv;
    /**
    * 
    */
    private String replSlavePriv;
    /**
    * 
    */
    private String replClientPriv;
    /**
    * 
    */
    private String createViewPriv;
    /**
    * 
    */
    private String showViewPriv;
    /**
    * 
    */
    private String createRoutinePriv;
    /**
    * 
    */
    private String alterRoutinePriv;
    /**
    * 
    */
    private String createUserPriv;
    /**
    * 
    */
    private String eventPriv;
    /**
    * 
    */
    private String triggerPriv;
    /**
    * 
    */
    private String createTablespacePriv;
    /**
    * 
    */
    private String sslType;
    /**
    * 
    */
    private Blob sslCipher;
    /**
    * 
    */
    private Blob x509Issuer;
    /**
    * 
    */
    private Blob x509Subject;
    /**
    * 
    */
    private Integer maxQuestions;
    /**
    * 
    */
    private Integer maxUpdates;
    /**
    * 
    */
    private Integer maxConnections;
    /**
    * 
    */
    private Integer maxUserConnections;
    /**
    * 
    */
    private String plugin;
    /**
    * 
    */
    private String authenticationString;
    /**
    * 
    */
    private String passwordExpired;
}