package com.jeral.userservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(path = "/")
public class UserController {

    @GetMapping()
    public Map<String, Object> getAllPosts(){
        Map<String, Object> response = new HashMap<>();
        response.put("statusCode", 200);
        response.put("msg", "Get all users query was successful");
        return response;
    }

}
