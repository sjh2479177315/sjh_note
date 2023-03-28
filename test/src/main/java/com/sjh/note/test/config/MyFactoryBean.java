package com.sjh.note.test.config;

import com.sjh.note.test.entity.Country;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * @author sunjiahui
 * @date 2023/3/28 2:50 下午
 */
@Component
public class MyFactoryBean implements FactoryBean<Country> {
    @Override
    public Country getObject() throws Exception {
        return new Country();
    }

    @Override
    public Class<?> getObjectType() {
        return Country.class;
    }

    @Override
    public boolean isSingleton() {
        // 此处ture是单例，此处是false，每次获取都要调用getObject
        return true;
    }
}
