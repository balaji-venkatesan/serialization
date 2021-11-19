package com.balajiv.serialization.dto;

import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class Teacher extends UserAttributes {
    private int rating;
    List<Subject> subjects;
    List<Department> departments;
}
