package com.lee.service.demo.impl;

import com.lee.entity.demo.User_C;
import com.lee.service.demo.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

/**
 * @ClassName UserServiceImpl
 * @Author LS
 * @Description 类描述:
 * @Date 2018/9/27 11:30
 * @Version 1.0
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public void save(User_C user) {
        mongoTemplate.save(user);
    }
}
