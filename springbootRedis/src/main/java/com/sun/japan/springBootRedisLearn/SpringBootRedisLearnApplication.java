package com.sun.japan.springBootRedisLearn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SpringBootRedisLearnApplication {

    @Autowired
    private RedisTemplate redisTemplate;

    @PostConstruct
    public void init(){
        RedisSerializer stringSerializer = redisTemplate.getStringSerializer();
        redisTemplate.setKeySerializer(stringSerializer);
        redisTemplate.setHashKeySerializer(stringSerializer);
        redisTemplate.setHashValueSerializer(stringSerializer);
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootRedisLearnApplication.class, args);
    }

}
