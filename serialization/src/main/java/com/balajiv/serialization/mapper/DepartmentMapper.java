package com.balajiv.serialization.mapper;


import com.balajiv.serialization.protobuf.message.SerializationProto.Department;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DepartmentMapper {
    
     com.balajiv.serialization.dto.Department mapToDto(Department departmentProto);
     Department mapToProto(com.balajiv.serialization.dto.Department departmentDto);
 
}
