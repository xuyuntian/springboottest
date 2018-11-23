package com.springtest.controller;

import com.springtest.entity.User;
import com.springtest.mapper.UserMapper;
import com.springtest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.RequestWrapper;
import java.util.List;

@RestController
public class Hello {
    @Autowired
    UserService userMapper;
    @RequestMapping("hello")
    public User sayHello(@RequestParam(name = "id",defaultValue = "1") Integer id){
        User u = userMapper.findUserById(id);
        return u;
    }
    @RequestMapping("getAll")
    public List<User> getAllUser(){
        return userMapper.findAll();
    }
}
