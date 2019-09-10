package com.example.rt.controller;


import com.example.rt.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

@RestController
@RequestMapping("resttemplate")
public class RestHander {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("findAll")
    public Collection<Student> findAll(){
//        return restTemplate.getForObject("http://localhost:1235/student/findAll", Collection.class);
        return restTemplate.getForEntity("http://localhost:1235/student/findAll", Collection.class).getBody();
    }

}
