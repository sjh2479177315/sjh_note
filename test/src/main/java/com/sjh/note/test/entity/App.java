package com.sjh.note.test.entity;

import lombok.Data;

/**
 * @author sunjiahui
 * @date 2023/3/28 11:43 上午
 */
@Data
public class App {

    private Long id;

    private String pkg;

    private String name;

    public App() {
        System.out.println("调用app的无餐构造器");
    }

    public void init() {
        System.out.println("初始化app");
    }

    public void destroy() {
        System.out.println("销毁app");
    }
}
