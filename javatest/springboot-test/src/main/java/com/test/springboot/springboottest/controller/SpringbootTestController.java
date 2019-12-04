package com.test.springboot.springboottest.controller;

import com.test.springboot.springboottest.entity.TestEntity;
import com.test.springboot.springboottest.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class SpringbootTestController {
    @Autowired
    private TestService testService;


    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public TestEntity test(@PathVariable Integer id) {
        TestEntity testEntity = null;
        try{
            System.out.println("id:" + id);
            testEntity = testService.getById(id);
        }catch (Exception e){
            e.printStackTrace();
        }

        return testEntity;
    }

}

