package com.example.redis_crud.crudservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private RedisTemplate<Long,Student> template;
    public Student findById(long id){
        return template.opsForValue().get(id);
    }

    public Student save(Student student) {
        template.opsForValue().set(student.getId(),student);
        return student;
    }

}
