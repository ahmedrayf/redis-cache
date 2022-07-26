package com.redis.cache.controller;

import com.redis.cache.entity.JWT;
import com.redis.cache.repository.JWTDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/redis")
public class Controller {

    @Autowired
    private JWTDao jwtDao;

    @PostMapping("/save")
    public JWT save(@RequestBody JWT jwt){
        return jwtDao.save(jwt);
    }

    @GetMapping("/findAll")
    public List<JWT> findAll(){
        return jwtDao.findAll();
    }

    @GetMapping("/find/{id}")
    public JWT findById(@PathVariable Long id){
        return jwtDao.findById(id);
    }
}
