package com.example.demo.version;

import org.springframework.web.bind.annotation.Mapping;

import java.lang.annotation.*;

/**
 * Created by tu_pei on 2017/7/7.
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Mapping
public @interface ApiVersion {
    /**
     * 版本号
     * @return
     */
    int value();
}
