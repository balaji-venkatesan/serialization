package com.balajiv.serialization.mapper;

import com.balajiv.serialization.protobuf.message.SerializationProto.*;

import org.mapstruct.CollectionMappingStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", collectionMappingStrategy = CollectionMappingStrategy.ADDER_PREFERRED,
        uses = {AdministratorMapper.class, StudentMapper.class, TeacherMapper.class,SubjectMapper.class, DepartmentMapper.class})
public interface CollegeMapper {

    @Mapping(source = "teachersList",target = "teachers")
    @Mapping(source = "studentsList",target = "students")
    @Mapping(source = "administratorsList",target = "administrators")
    com.balajiv.serialization.dto.College mapToDto(College collegeProto);

    @Mapping(source = "teachers",target = "teachersList")
    @Mapping(source = "students",target = "studentsList")
    @Mapping(source = "administrators",target = "administratorsList")
    College mapToProto(com.balajiv.serialization.dto.College collegeDto);
    
}
