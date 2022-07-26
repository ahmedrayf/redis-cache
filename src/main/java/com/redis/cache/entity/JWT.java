package com.redis.cache.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;


@Data
@AllArgsConstructor
@NoArgsConstructor
@RedisHash("JWT")
public class JWT implements Serializable {
    private Long userId;
    private String userName;
    private String token;
    private Boolean isExpired;
}
