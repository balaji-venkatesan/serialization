package com.balajiv.serialization.mapper;


import com.balajiv.serialization.protobuf.message.SerializationProto.Subject;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SubjectMapper {

    com.balajiv.serialization.dto.Subject mapToDto(Subject subjectProto);
    Subject mapToProto(com.balajiv.serialization.dto.Subject subjectDto);
 
}
