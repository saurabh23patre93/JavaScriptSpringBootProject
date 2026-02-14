package com.javascript.springboot.dto;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@Data
@RedisHash("Student")
public class Student {

    @Id
    private String id;
    private String firstName;
    private String middleName;
    private String lastName;
    private String dob;
    private String education;
    private String address;
}
