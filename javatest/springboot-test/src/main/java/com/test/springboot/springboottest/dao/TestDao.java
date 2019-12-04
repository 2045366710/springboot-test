package com.test.springboot.springboottest.dao;

import com.test.springboot.springboottest.entity.TestEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestDao {
    TestEntity getById(Integer id);

}
