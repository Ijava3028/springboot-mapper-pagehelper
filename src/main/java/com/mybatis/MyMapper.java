package com.mybatis;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * Created by qull on 18-3-9.
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
