package com.balajiv.serialization.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Subject {
    private long id;
    private String name;
    private String description;
}
