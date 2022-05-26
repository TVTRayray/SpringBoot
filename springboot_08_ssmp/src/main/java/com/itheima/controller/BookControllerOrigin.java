package com.itheima.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.itheima.domain.Book;
import com.itheima.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController
@RequestMapping("/books")
public class BookControllerOrigin {
    @Autowired
    private IBookService bookService;

    @GetMapping
    public List<Book> getAll(){
        return bookService.list();
    }

    @PutMapping
    public boolean update(@RequestBody Book book){

        return bookService.updateById(book);
    }

    @PostMapping
    public boolean save(@RequestBody Book book){
        return bookService.save(book);
    }

    @DeleteMapping("{id}")
    public boolean delete(@PathVariable Integer id){
        return bookService.removeById(id);
    }

    @GetMapping("{id}")
    public Book getById(@PathVariable Integer id){
        return bookService.getById(id);
    }

    @GetMapping("{currentPage}/{size}")
    public IPage<Book> getPage(@PathVariable int currentPage,@PathVariable int size){
        return bookService.getPage(currentPage,size);
    }

    //此处不能写成类似 TODO:@GetMapping("{id}")这种的，会导致冲突，可以考虑先判断再使用
//    @GetMapping("/conditions/{condition}")
//    public List<Book> getByCondition(@PathVariable String condition){
//        return bookService.getByCondition(condition);
//    }
}
