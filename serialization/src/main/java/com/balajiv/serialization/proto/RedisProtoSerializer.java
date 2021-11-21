package com.balajiv.serialization.proto;

import com.balajiv.serialization.dto.College;
import com.balajiv.serialization.mapper.CollegeMapper;
import com.balajiv.serialization.mapper.CollegeMapperImpl;
import com.balajiv.serialization.protobuf.message.SerializationProto;
import com.google.protobuf.InvalidProtocolBufferException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.SerializationException;

public class RedisProtoSerializer implements RedisSerializer<College> {

    @Autowired
    CollegeMapper mapper;

    @Override
    public byte[] serialize(College collegeDto) throws SerializationException {
        return mapper.mapToProto(collegeDto).toByteArray();
    }

    @Override
    public College deserialize(byte[] bytes) throws SerializationException {

        if (bytes == null) {
            return null;
        }

        try {
            SerializationProto.College collegeProto = SerializationProto.College.parseFrom(bytes);
            College college = mapper.mapToDto(collegeProto);
            System.out.println("deserialized value = " + college);
            return college;
        } catch (InvalidProtocolBufferException e) {
            e.printStackTrace();
            return null;
        }
    }
}
