package com.example.redis_crud.crudservice;
import lombok.*;

import java.io.Serializable;

@Data
public class Student implements Serializable {
    private long id;
    private String name;
    private int age;
}
