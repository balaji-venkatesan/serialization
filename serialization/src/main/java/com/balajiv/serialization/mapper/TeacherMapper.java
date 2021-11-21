package com.balajiv.serialization.mapper;

import com.balajiv.serialization.protobuf.message.SerializationProto.Teacher;

import com.fasterxml.jackson.databind.util.ArrayIterator;
import org.mapstruct.*;

@Mapper(componentModel = "spring", collectionMappingStrategy = CollectionMappingStrategy.ADDER_PREFERRED, uses = {SubjectMapper.class, DepartmentMapper.class})
public interface TeacherMapper {

    @Mapping(source = "departmentList", target = "departments")
    @Mapping(source = "subjectList", target = "subjects")
    com.balajiv.serialization.dto.Teacher mapToDto(Teacher teacherProto);

    @Mapping(source = "departments", target = "departmentList")
    @Mapping(source = "subjects", target = "subjectList")
    Teacher mapToProto(com.balajiv.serialization.dto.Teacher teacherDto);

}
