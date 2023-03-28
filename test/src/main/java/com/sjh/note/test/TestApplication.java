package com.sjh.note.test;

import com.sjh.note.test.config.BeanTestConfig;
import com.sjh.note.test.entity.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class TestApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanTestConfig.class);
        System.out.println("容器创建完毕");
        // test @Bean
//        User user = context.getBean(User.class);
//        String[] beanNamesForType = context.getBeanNamesForType(User.class);
//        System.out.println(user);
//        Arrays.stream(beanNamesForType).forEach(System.out::println);
//        User testUser = (User)context.getBean("user");
//        System.out.println(testUser);

        // test ComponentScan
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        Arrays.stream(beanDefinitionNames).forEach(System.out::println);

//        Object country = context.getBean("myFactoryBean");
//        System.out.println(country.getClass());
//
//        Object myFactoryBean = context.getBean("&myFactoryBean");
//        System.out.println(myFactoryBean.getClass());

    }

}
