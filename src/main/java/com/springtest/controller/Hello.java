package com.springtest.controller;

import com.springtest.entity.User;
import com.springtest.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.xml.ws.RequestWrapper;

@Controller
public class Hello {
    @Autowired
    UserMapper userMapper;
    @RequestMapping("hello")
    @ResponseBody
    public User sayHello(@RequestParam(name = "id",defaultValue = "1") Integer id){
        User u = userMapper.findUserById(id);
        return u;
    }
}
