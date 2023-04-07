package com.sjh.note.test.entity;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author sunjiahui
 * @date 2023/4/4 12:25 下午
 */
@Component
public class Fish {

    @PostConstruct
    public void init() {
        System.out.println("初始化fish");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("销毁fish");
    }

}
