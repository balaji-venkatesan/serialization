package com.balajiv.serialization.controller;

import org.springframework.web.bind.annotation.RestController;

import com.balajiv.serialization.dto.College;
import com.balajiv.serialization.dto.StatusResponse;
import com.balajiv.serialization.mapper.MapStructMapper;
import com.balajiv.serialization.service.CollegeService;
import com.balajiv.serialization.util.CollegeHelper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
public class CollegeController {

    @Autowired
    CollegeService collegeService;

    @Autowired
    MapStructMapper mapper;

    @PostMapping(value = "/api/v1/college")
    public StatusResponse createCollegeV1() {
        College collegeDto = CollegeHelper.create();
        collegeService.createV1(collegeDto);

        StatusResponse response = new StatusResponse();
        response.setSuccess(true);
        return response;
    }

    @PostMapping(value = "/api/v2/college")
    public StatusResponse createCollegeV2() {
        College collegeDto = CollegeHelper.create();
        collegeService.createV2(collegeDto);

        // to check if deserialize is working fine or not
        collegeService.createV2(collegeDto);

        StatusResponse response = new StatusResponse();
        response.setSuccess(true);
        return response;
    }
}

/*
 * The purpose of this project is to just populate the redis with huge amount of
 * data and compare it with proto serializer -> so don't focus more on the logic
 * part -> get data from controller and send it to service layer where we will
 * be just populting the redis
 * 
 * There will be two types of redis template and endpoints, 1. with default java
 * serializer 2. with proto serilaizer which we will be building
 * 
 * 
 * In the blog or readme it will be like, For this example we will be populating
 * a user object to redis with proto and default serializer -> our major focus
 * is towards the memory consumed in redis while using two different type of
 * serializartion
 */