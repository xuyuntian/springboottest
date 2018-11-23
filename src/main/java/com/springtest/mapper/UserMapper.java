package com.springtest.mapper;

import com.springtest.entity.User;

import java.util.List;

public interface UserMapper {
    public User findUserById(Integer id);
    public List<User> findAll();
}
