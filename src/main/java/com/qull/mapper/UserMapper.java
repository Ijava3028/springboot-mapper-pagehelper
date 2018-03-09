package com.qull.mapper;

import com.mybatis.MyMapper;
import com.qull.entiy.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends MyMapper<User> {
}