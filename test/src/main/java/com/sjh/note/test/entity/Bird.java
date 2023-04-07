package com.sjh.note.test.entity;

import lombok.Data;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * @author sunjiahui
 * @date 2023/4/4 12:03 下午
 */
@Component
@Data
public class Bird implements InitializingBean, DisposableBean {

    public Bird() {
        System.out.println("调用bird的无参构造器");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("调用bird的销毁方法");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("初始化bird");
    }
}
