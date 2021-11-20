package com.balajiv.serialization.mapper;

import com.balajiv.serialization.protobuf.message.SerializationProto.Teacher;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {SubjectMapper.class, DepartmentMapper.class})
public interface TeacherMapper {
    
    com.balajiv.serialization.dto.Teacher mapToDto(Teacher teacherProto);

    @Mapping(source = "subjects", target = "subjectList", qualifiedByName = "subject")
    Teacher mapToProto(com.balajiv.serialization.dto.Teacher teacherDto);
}
