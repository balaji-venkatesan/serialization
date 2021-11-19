package com.balajiv.serialization.controller;

import com.balajiv.serialization.dto.StatusResponse;
import com.balajiv.serialization.service.HealthCheckService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

    @Autowired
    HealthCheckService healthCheckService;

    @GetMapping(path = "/health")
    public StatusResponse helthCheck() {

        StatusResponse response = new StatusResponse();
        response.setSuccess(healthCheckService.getStatus());
        return response;
    }

}
