package com.example.demo.entity;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity(name="student")  // DB 상에서 테이블 명 설정
public class StudentEntity {

    @Id
    @GeneratedValue
    Long id;
    String name;
    String address;

    public void update(String name, String address) {
        this.name = name;
        this.address = address;
    }

}
