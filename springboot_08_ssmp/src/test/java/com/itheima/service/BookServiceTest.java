package com.itheima.service;

import com.itheima.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookServiceTest {
    @Autowired
    private BookService bookService;
    @Test
    void testSave(){
        Book book = new Book();
        book.setName("service_test");
        book.setType("service_test");
        book.setDescription("service_test");
        bookService.save(book);
    }
    @Test
    void testUpdate(){
        Book book = new Book();
        book.setId(11);
        book.setName("service_test111");
        book.setType("service_test");
        book.setDescription("service_test");
        bookService.update(book);
    }
    @Test
    void testDelete(){
        bookService.delete(11);
    }
    @Test
    void testGetById(){
        bookService.getById(1);
    }
    @Test
    void testGetAll(){
        bookService.getAll();
    }

    @Test
    void testGetPage(){
        bookService.getPage(4,3);
    }
}
