package com.balajiv.serialization.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class HealthCheckService {

    @Autowired
    private RedisTemplate<Object, Object> redisTemplate;

    public boolean getStatus(){
        redisTemplate.opsForValue().set("name", "book");
        return true;
    }
    
}
