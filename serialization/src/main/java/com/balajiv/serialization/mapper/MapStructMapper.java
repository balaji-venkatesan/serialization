package com.balajiv.serialization.mapper;

import com.balajiv.serialization.protobuf.message.SerializationProto.*;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MapStructMapper {

    // college mapper
    com.balajiv.serialization.dto.College mapToDto(College collegeProto);
    College mapToProto(com.balajiv.serialization.dto.College collegeDto);

    // student mapper
    com.balajiv.serialization.dto.Student mapToDto(Student studentProto);
    Student mapToProto(com.balajiv.serialization.dto.Student studentDto);

    // department mapper
    com.balajiv.serialization.dto.Department mapToDto(Department departmentProto);
    Department mapToProto(com.balajiv.serialization.dto.Department departmentDto);

    // administrator mapper
    com.balajiv.serialization.dto.Administrator mapToDto(Administrator administratorProto);
    Administrator mapToProto(com.balajiv.serialization.dto.Administrator administratorDto);

    // teacher mapper
    com.balajiv.serialization.dto.Teacher mapToDto(Teacher teacherProto);
    Teacher mapToProto(com.balajiv.serialization.dto.Teacher teacherDto);

    // subject mapper
    com.balajiv.serialization.dto.Subject mapToDto(Subject subjectProto);
    Subject mapToProto(com.balajiv.serialization.dto.Subject subjectDto);


    
}
