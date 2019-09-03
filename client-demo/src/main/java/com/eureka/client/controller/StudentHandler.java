package com.eureka.client.controller;

import com.eureka.client.entity.Student;
import com.eureka.client.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * @author liuyzh
 * @description:
 * @date 2019/9/3 16:36
 */
@RestController
@RequestMapping("/student")
public class StudentHandler {

    @Autowired
    public StudentRepository studentRepository;

    @GetMapping("findAll")
    public Collection<Student> findAll(){
        return studentRepository.findAll();
    }



}
