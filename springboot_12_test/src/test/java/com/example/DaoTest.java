package com.example;

import com.example.dao.BookDao;
import com.example.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest

//事务的注解，加上和测试数据不会加到数据库中
@Transactional
public class DaoTest {
    @Autowired
    private BookDao bookDao;

    @Test
    void testSave(){
        Book book = new Book();
        book.setDescription("1113");
        book.setName("java");
        book.setType("2223");
        bookDao.insert(book);

    }
}
