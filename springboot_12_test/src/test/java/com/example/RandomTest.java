package com.example;

import com.example.domain.RandomBook;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest

//事务的注解，加上和测试数据不会加到数据库中
@Transactional
public class RandomTest {
    @Autowired
    private RandomBook randomBook;

    @Test
    void testSave(){
        System.out.println(randomBook);
    
    }
}
