package com.sjh.note.test.config;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author sunjiahui
 * @date 2023/3/28 11:43 上午
 */
public class MyImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{
                "com.sjh.note.test.entity.App",
                "com.sjh.note.test.entity.Book",
                "com.sjh.note.test.entity.School"
        };
    }
}
