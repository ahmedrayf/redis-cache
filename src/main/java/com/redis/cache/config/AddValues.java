package com.redis.cache.config;

import com.redis.cache.entity.JWT;
import com.redis.cache.repository.JWTDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AddValues implements CommandLineRunner {

    @Autowired
    private JWTDao jwtDao;
    @Override
    public void run(String... args) throws Exception {
        JWT jwt = new JWT(1L,"ahmedrayf" , "mdhg5njbgdh65gsadjkh" , false);
        jwtDao.save(jwt);

    }
}
