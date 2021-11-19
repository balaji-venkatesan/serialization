package com.balajiv.serialization.impl;

import com.balajiv.serialization.dto.College;
import com.balajiv.serialization.service.CollegeService;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class CollegeServiceImpl implements CollegeService {

    @Override
    @Cacheable(value = "genericjacksonCache", key = "#collegeDto.id")
    public College createV1(College collegeDto) {
        return collegeDto;
    }

    @Override
    @Cacheable(value = "protoCache", key = "#collegeDto.id")
    public College createV2(College collegeDto) {
        return collegeDto;
    }

}
