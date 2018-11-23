package com.springtest.service;

import com.springtest.entity.User;
import com.springtest.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;
    public User findUserById(Integer id){
        return  userMapper.findUserById(id);
    }
    public List<User> findAll(){
        return userMapper.findAll();
    }
}
