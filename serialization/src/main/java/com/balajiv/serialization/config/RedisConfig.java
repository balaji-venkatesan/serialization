package com.balajiv.serialization.config;

import java.time.Duration;

import com.balajiv.serialization.dto.College;
import com.balajiv.serialization.proto.RedisProtoSerializer;

import org.springframework.boot.autoconfigure.cache.RedisCacheManagerBuilderCustomizer;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializationContext.SerializationPair;

@Configuration
@EnableCaching
public class RedisConfig {

    @Bean("javaSerializer")
    public RedisTemplate<String, College> redisTemplate(RedisConnectionFactory connectionFactory) {
        RedisTemplate<String, College> template = new RedisTemplate<>();
        template.setConnectionFactory(connectionFactory);
        template.setKeySerializer(new StringRedisSerializer());
        template.setValueSerializer(new GenericJackson2JsonRedisSerializer());
        return template;
    }

    @Bean("protoSerializer")
    public RedisTemplate<String, College> redisTemplateProto(RedisConnectionFactory connectionFactory) {
        RedisTemplate<String, College> template = new RedisTemplate<>();
        template.setConnectionFactory(connectionFactory);
        template.setValueSerializer(new RedisProtoSerializer());
        template.setKeySerializer(new StringRedisSerializer());
        return template;
    }

    @Bean
    public RedisCacheManagerBuilderCustomizer redisCacheManagerBuilderCustomizer() {
        return (builder) -> builder
                .withCacheConfiguration("protoCache",
                        RedisCacheConfiguration.defaultCacheConfig().entryTtl(Duration.ofHours(100))
                                .serializeValuesWith(SerializationPair.fromSerializer(redisSerializer()))
                                .serializeKeysWith(SerializationPair.fromSerializer(new StringRedisSerializer())))
                .withCacheConfiguration("genericjacksonCache",
                        RedisCacheConfiguration.defaultCacheConfig().entryTtl(Duration.ofHours(100))
                                .serializeValuesWith(
                                        SerializationPair.fromSerializer(new GenericJackson2JsonRedisSerializer()))
                                .serializeKeysWith(SerializationPair.fromSerializer(new StringRedisSerializer())));
    }

    @Bean
    public RedisSerializer<College> redisSerializer(){
        return new RedisProtoSerializer();
    }
}
