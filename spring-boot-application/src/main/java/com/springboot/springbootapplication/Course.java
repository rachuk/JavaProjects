package com.springboot.springbootapplication;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Course {
    private long id;
    private String name;
    private String author;

}
