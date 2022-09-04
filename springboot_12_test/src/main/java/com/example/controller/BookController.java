package com.example.controller;

import com.example.domain.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {

    @GetMapping
    public Book getById(){
        Book book = new Book();
        book.setDescription("111");
        book.setName("java");
        book.setType("222");
        book.setId(1);
        return book;
    }

}
