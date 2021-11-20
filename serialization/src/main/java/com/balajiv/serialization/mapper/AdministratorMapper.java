package com.balajiv.serialization.mapper;


import com.balajiv.serialization.protobuf.message.SerializationProto.Administrator;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AdministratorMapper {

    com.balajiv.serialization.dto.Administrator mapToDto(Administrator administratorProto);
    Administrator mapToProto(com.balajiv.serialization.dto.Administrator administratorDto);

}
