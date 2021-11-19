package com.balajiv.serialization.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class Student extends UserAttributes {
    private Department department;

}
