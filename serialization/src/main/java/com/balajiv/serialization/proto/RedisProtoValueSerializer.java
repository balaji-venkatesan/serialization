package com.balajiv.serialization.proto;

import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.SerializationException;

public class RedisProtoValueSerializer implements RedisSerializer<Long> {

    @Override
    public byte[] serialize(Long value) throws SerializationException {
        // UserProto.Long.Builder builder = UserProto.Long.newBuilder();
        // builder.setKey(value.intValue());
        // return builder.build().toByteArray();
        return null;
    }

    @Override
    public Long deserialize(byte[] bytes) throws SerializationException {
        // if (bytes == null) {
        // return null;
        // } else {
        // try {
        // UserProto.Long userProto = UserProto.Long.parseFrom(bytes);
        // return new Long(userProto.getKey());
        // } catch (InvalidProtocolBufferException e) {
        // e.printStackTrace();
        // }
        // return null;
        // }
        return null;
    }

}
