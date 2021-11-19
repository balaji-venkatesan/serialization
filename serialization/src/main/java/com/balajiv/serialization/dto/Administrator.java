package com.balajiv.serialization.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class Administrator extends UserAttributes {
    private String roleDescription;
}
