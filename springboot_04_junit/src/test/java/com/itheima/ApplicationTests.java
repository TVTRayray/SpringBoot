package com.itheima;

import com.itheima.dao.BookDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * springboot整合junit：
 * 1.注入测试对象
 * 2.执行要测试对象对应的方法
 */
@SpringBootTest
class ApplicationTests {

    //1
    @Autowired
    private BookDao bookDao;

    @Test
    void contextLoads() {
        //2
        bookDao.save();
    }

}
