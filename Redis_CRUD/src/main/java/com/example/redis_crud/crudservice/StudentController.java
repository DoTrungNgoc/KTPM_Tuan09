package com.example.redis_crud.crudservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("crud/")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("get-by-id/{id}")
    public Student getById(@PathVariable long id){
        return studentService.findById(id);
    }

    @PostMapping("/create")
    public Student create(@RequestBody  Student student){
        return studentService.save(student);
    }


}
