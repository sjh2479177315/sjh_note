package com.sjh.note.test.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @author sunjiahui
 * @date 2023/3/27 5:57 下午
 */
@Component
//@NoArgsConstructor
//@AllArgsConstructor
@Data
public class User {

    public User() {
        this.name = "test";
        this.age = 18;
        System.out.println("往ioc容器中注册user bean");
    }

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    private String name;

    private Integer age;
}
