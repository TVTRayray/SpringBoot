package com.itheima.controller;

import com.itheima.domain.Book;
import com.itheima.service.IBookService;
import com.itheima.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private IBookService bookService;

    @GetMapping
    public R getAll(){
        return new R(true,bookService.list());
    }

    @PutMapping
    public R update(@RequestBody Book book){
        return new R(bookService.updateById(book));
    }

    @PostMapping
    public R save(@RequestBody Book book){
        return new R(bookService.save(book));
    }

    @DeleteMapping("{id}")
    public R delete(@PathVariable Integer id){
        return new R(bookService.removeById(id));
    }

    @GetMapping("{id}")
    public R getById(@PathVariable Integer id){
        return new R(true,bookService.getById(id));
    }

    @GetMapping("{currentPage}/{size}")
    public R  getPage(@PathVariable int currentPage,@PathVariable int size){
        return new R(true,bookService.getPage(currentPage,size));
    }

    @GetMapping("/conditions/{condition}")
    public R getByCondition(@PathVariable String condition){
        return new R(true,bookService.getByCondition(condition));
    }
}
