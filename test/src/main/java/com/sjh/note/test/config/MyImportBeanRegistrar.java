package com.sjh.note.test.config;

import com.sjh.note.test.entity.Phone;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author sunjiahui
 * @date 2023/3/28 2:36 下午
 */
public class MyImportBeanRegistrar implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        final String beanName = "iphone";
        boolean containsBeanDefinition = registry.containsBeanDefinition(beanName);
        if (!containsBeanDefinition) {
            RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(Phone.class);
            registry.registerBeanDefinition(beanName, rootBeanDefinition);
        }

    }
}
