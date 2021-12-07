package com.example.jartest.controller;

import com.example.jartest.pojo.Student;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HelloController {

    @PostMapping("/hello")
    public Student getStudent(@RequestBody Student param) throws JsonProcessingException {
        log.info(">>> request param: {}", new ObjectMapper().writeValueAsString(param));

        Student student = new Student();
        student.setName("张三");
        student.setAge(18);
        student.setIdCard("44789841984848494X");

        log.info(">>> response param: {}", new ObjectMapper().writeValueAsString(student));
        return student;
    }
}
