package com.springtest.service;

import com.springtest.entity.User;
import com.springtest.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class UserService {
    @Autowired
    private UserMapper userMapper;
    public User findUserById(Integer id){
        return  userMapper.findUserById(id);
    }
}
