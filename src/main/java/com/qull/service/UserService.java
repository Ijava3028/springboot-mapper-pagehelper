package com.qull.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qull.entiy.User;
import com.qull.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Created by qull on 18-3-9.
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public PageInfo<User> findAll(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        PageInfo<User> pageInfo = new PageInfo<>(userMapper.selectAll());
        return pageInfo;
    }

    public int addUser(User user){
        return userMapper.insertSelective(user);
    }
}
