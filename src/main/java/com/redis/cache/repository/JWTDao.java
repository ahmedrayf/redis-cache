package com.redis.cache.repository;

import com.redis.cache.entity.JWT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JWTDao {

    public static final String HASH_KEY = "JWT";
    @Autowired
    RedisTemplate redisTemplate;

    public JWT save(JWT jwt){
        redisTemplate.opsForHash().put(HASH_KEY , jwt.getUserId() , jwt);
        return jwt;
    }

    public List<JWT> findAll(){
        return redisTemplate.opsForHash().values(HASH_KEY);
    }

    public JWT findById(Long id){
        return (JWT) redisTemplate.opsForHash().get(HASH_KEY , id);
    }


}
