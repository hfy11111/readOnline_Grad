package com.hfy.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@Accessors
public class Student implements Serializable {
    private int id;
    private String name;

    public Student(String name){
     this.name=name;
    }

}
