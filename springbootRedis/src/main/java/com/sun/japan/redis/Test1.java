package com.sun.japan.redis;

import com.sun.japan.config.RedisConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.core.BoundSetOperations;
import org.springframework.data.redis.core.RedisOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.SessionCallback;
import org.springframework.data.redis.serializer.RedisSerializer;

public class Test1 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(RedisConfig.class);
        RedisTemplate redisTemplate = applicationContext.getBean(RedisTemplate.class);
//        redisTemplate.opsForValue().set("key2","value2");
//        redisTemplate.opsForHash().put("hash","field","hvalue");
//        redisTemplate.opsForHash().put("hash","field1","value1");
//        redisTemplate.opsForSet().add("set","1","2","3");
        BoundSetOperations setOps = redisTemplate.boundSetOps("set");
        System.out.println(setOps.members());
//        redisTemplate.execute(new SessionCallback() {
//            @Override
//            public Object execute(RedisOperations redisOperations) throws DataAccessException {
//                return null;
//            }
//        })
    }
}
