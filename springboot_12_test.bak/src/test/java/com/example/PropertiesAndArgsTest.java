package com.example;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 为测试添加临时属性：properties、args都可以，且args等同于在命令行中设置参数，所有优先级更高
 */
@SpringBootTest(properties = {"test.pop=testValue2","test.op=1"},args = {"--test.pop=testValue3"})
public class PropertiesAndArgsTest {

    @Value("${test.pop}")
    private String msg;
    @Value("${test.op}")
    private String op;

    @Test
    void testProperties(){
        System.out.println(msg);
        System.out.println(op);
    }
}
