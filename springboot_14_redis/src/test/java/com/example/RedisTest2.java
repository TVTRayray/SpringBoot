package com.example;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

@SpringBootTest
class RedisTest2 {
    @Autowired
    private StringRedisTemplate redisTemplate;
    /**
     * RedisTemplate对数据操作时，会将key中的内容当作是对象进行处理
     * 而在Redis客户端中操作数据时，会将key当作字符串进行处理，而StringRedisTemplate也是采用的这种方式
     */

    @Test
    void get(){
        ValueOperations<String, String> ops = redisTemplate.opsForValue();
        String naem = ops.get("naem");
        System.out.println(naem);
    }
}
