package com.allen.svc.service.impl;

import com.allen.domain.dao.NlpNewsFeedMapper;
import com.allen.svc.service.MybatisService;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MybatisServiceImpl implements MybatisService {

    @Resource
    private RedisTemplate redisTemplate;

    @Resource
    private StringRedisTemplate stringRedisTemplate;

    @Resource
    private NlpNewsFeedMapper nlpNewsFeedMapper;

    @Override
    public String testMybatis() {
        List<Long> topTen = nlpNewsFeedMapper.getTopTen();
        return "success";
    }

    @Override
    public String testRedis() {
        RedisSerializer<?> serializer = stringRedisTemplate.getHashValueSerializer();
        HashOperations<String, Object, Object> hashOperations = stringRedisTemplate.opsForHash();
        hashOperations.put("allen", "hash", "hash");

//        HashOperations ops = redisTemplate.opsForHash();
//        ops.put("allen:test", "first", 1);
        return "success";
    }
}
