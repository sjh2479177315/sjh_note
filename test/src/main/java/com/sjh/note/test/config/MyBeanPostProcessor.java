package com.sjh.note.test.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * @author sunjiahui
 * @date 2023/4/4 5:56 下午
 * 初始化是在实例化之后进行
 */
@Component
public class MyBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        // 此时bean属性已被赋值

        // 此处加个限制，不然所有被扫描的bean都会打印
        if ("bird".equals(beanName)) {
            System.out.println(beanName + "初始化之前调用");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

        // 此处加个限制，不然所有被扫描的bean都会打印
        if ("bird".equals(beanName)) {
            System.out.println(beanName + "初始化之后调用");
        }
        return bean;
    }
}
