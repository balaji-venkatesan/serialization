package com.balajiv.serialization.mapper;


import com.balajiv.serialization.protobuf.message.SerializationProto.Student;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StudentMapper {

    com.balajiv.serialization.dto.Student mapToDto(Student studentProto);
    Student mapToProto(com.balajiv.serialization.dto.Student studentDto);
    
}
