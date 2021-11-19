package com.balajiv.serialization.dto;

import java.util.List;


import lombok.Data;

@Data
public class College {
    private long id;
    private String name;
    private long mobile;
    private String address;
    List<Teacher> teachers;
    List<Student> students;
    List<Administrator> administrators;
}
