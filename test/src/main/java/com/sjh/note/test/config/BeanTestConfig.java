package com.sjh.note.test.config;

import com.sjh.note.test.entity.School;
import com.sjh.note.test.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Controller;

/**
 * @author sunjiahui
 * @date 2023/3/27 6:08 下午
 */
//@ComponentScan(value = "com.sjh.note.test.entity", excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class})})
//@ComponentScan(value = "com.sjh.note.test.entity", excludeFilters = {@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = {User.class})})
//@ComponentScan(value = "com.sjh.note.test.entity", includeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class})}, useDefaultFilters = false)
@ComponentScan("com.sjh.note.test.entity")
//@Configuration
@Import({School.class})
public class BeanTestConfig {

    //@Bean
    public User user() {
        System.out.println("往ioc容器中注册user bean");
        return new User("test", 20);
    }
}
