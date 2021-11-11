package com.example.crud_redis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import org.springframework.data.redis.core.RedisTemplate;
@SpringBootApplication
public class CrudRedisApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrudRedisApplication.class, args);
    }

}
