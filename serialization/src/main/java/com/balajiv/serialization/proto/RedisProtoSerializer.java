package com.balajiv.serialization.proto;

import com.balajiv.serialization.dto.College;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.SerializationException;

public class RedisProtoSerializer implements RedisSerializer<College> {

    @Override
    public byte[] serialize(College userDto) throws SerializationException {
        // UserProto.User.Builder builder = UserProto.User.newBuilder();
        // builder.setId((int) userDto.getId());
        // return builder.build().toByteArray();
        return null;
    }

    @Override
    public College deserialize(byte[] bytes) throws SerializationException {

        // if (bytes == null) {
        // return null;
        // }

        // College userDto = new College();
        // try {
        // UserProto.User userProto = UserProto.User.parseFrom(bytes);
        // userDto.setId((long) userProto.getId());
        // } catch (InvalidProtocolBufferException e) {
        // e.printStackTrace();
        // }
        // return userDto;
        return null;
    }

}
