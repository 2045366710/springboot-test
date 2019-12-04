package com.test.springboot.springboottest.service;

import com.test.springboot.springboottest.dao.TestDao;
import com.test.springboot.springboottest.entity.TestEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Autowired
    private TestDao testDao ;

    public TestEntity getById(Integer id){
        System.out.println(testDao.getById(id).getFirstName());
        System.out.println(testDao.getById(id).getFirstName());
        System.out.println(testDao.getById(id).getFirstName());




        return testDao.getById(id);
    }

}
