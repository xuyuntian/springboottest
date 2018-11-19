package com.springtest.controller;

import com.springtest.entity.User;
import com.springtest.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.xml.ws.RequestWrapper;

@Controller
public class Hell {
    @Autowired
    UserMapper userMapper;
    @RequestMapping("hello")
    @ResponseBody
    public String sayHello(){
        User u = userMapper.findUserById(1);
        return u.getPassword();
    }
}
