package com.lw.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * Created by Administrator on 2018/6/16
 */
@Service
public class StudentRedisService {
    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    private HashOperations<String, String, String> hashOperations;

    @PostConstruct
    public void init() {
        hashOperations = redisTemplate.opsForHash();
    }

    public void put(String key, String name) {
        hashOperations.put("hugo", key, name);
    }

    public String get(String key) {
        return hashOperations.get("hugo", key);
    }
}
