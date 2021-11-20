package com.balajiv.serialization.mapper;

import com.balajiv.serialization.protobuf.message.SerializationProto.*;

import org.mapstruct.CollectionMappingStrategy;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", collectionMappingStrategy = CollectionMappingStrategy.ADDER_PREFERRED,
        uses = {AdministratorMapper.class, StudentMapper.class, TeacherMapper.class,SubjectMapper.class, DepartmentMapper.class})
public interface CollegeMapper {

    com.balajiv.serialization.dto.College mapToDto(College collegeProto);

    College mapToProto(com.balajiv.serialization.dto.College collegeDto);
    
}
