package com.example.domain;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Data
//更快的绑定方式，其实是使用@ConfigurationProperties
@ConfigurationProperties(prefix = "testcase")
public class RandomBook {
//    @Value("${testcase.id}")
    private Integer id;
//    @Value("${testcase.name}")
    private String name;
//    @Value("${testcase.publishTime}")
    private long publishTime;
//    @Value("${testcase.uuid}")
    private String uuid;

}
