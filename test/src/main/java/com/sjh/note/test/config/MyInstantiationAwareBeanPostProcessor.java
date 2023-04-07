package com.sjh.note.test.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

import java.beans.PropertyDescriptor;

/**
 * @author sunjiahui
 * @date 2023/4/6 10:47 上午
 * 实例化是在初始化之前进行
 */
@Component
public class MyInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {

    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        // 1、此处能拿到待实例化的bean的class和名称
        // 返回值不为null时，后续只会调用BeanPostProcessor的 postProcessAfterInitialization方法，而不会调用别的后续后置处理方法（如postProcessAfterInitialization、postProcessBeforeInstantiation等方法）
        // 返回值也可以为null，这时候Bean将按默认方式初始化

        // 此处加个限制，不然所有被扫描的bean都会打印
        if ("bird".equals(beanName)) {
            System.out.println(beanName + "实例化之前调用");
        }
        return null;
    }

    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        // 2、返回ture，则走postProcessProperties方法，对属性进行赋值
        // 如果返回false，则不会走赋值方法

        // 此处加个限制，不然所有被扫描的bean都会打印
        if ("bird".equals(beanName)) {
            System.out.println(beanName + "实例化后调用");
        }
        return true;
    }

    @Override
    public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
        // 3
        // 此处加个限制，不然所有被扫描的bean都会打印
        if ("bird".equals(beanName)) {
            System.out.println(beanName + "实例化后的赋值");
        }

        return pvs;
    }

    @Override
    public PropertyValues postProcessPropertyValues(PropertyValues pvs, PropertyDescriptor[] pds, Object bean, String beanName) throws BeansException {
        return null;
    }
}
