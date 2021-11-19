package com.balajiv.serialization.dto;

import lombok.Data;

@Data
public class UserAttributes {
    private long id;
    private String name;
    private Gender gender;
}
