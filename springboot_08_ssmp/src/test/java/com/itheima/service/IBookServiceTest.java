package com.itheima.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itheima.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class IBookServiceTest {
    @Autowired
    private IBookService bookService;
    @Test
    void testSave(){
        Book book = new Book();
        book.setName("service_MP_test");
        book.setType("service_MP_test");
        book.setDescription("service_MP_test");
        bookService.save(book);
    }
    @Test
    void testUpdate(){
        Book book = new Book();
        book.setId(12);
        book.setName("service_MP_test_111");
        book.setType("service_MP_test");
        book.setDescription("service_MP_test");
        bookService.updateById(book);
    }
    @Test
    void testDelete(){
        bookService.removeById(12);
    }
    @Test
    void testGetById(){
        bookService.getById(1);
    }
    @Test
    void testGetAll(){
        bookService.list();
    }

    @Test
    void testGetPage(){
        IPage page = new Page(2,5);
        bookService.page(page);
    }
}
