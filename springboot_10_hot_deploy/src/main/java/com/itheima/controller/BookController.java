package com.itheima.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
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
        boolean flag = bookService.save(book);
        return new R(flag,flag?"添加成功！":"添加失败！");
    }

    @DeleteMapping("{id}")
    public R delete(@PathVariable Integer id){
        return new R(bookService.removeById(id));
    }

    @GetMapping("{id}")
    public R getById(@PathVariable Integer id){
        System.out.println("test host deploy");
        System.out.println("test host deploy");
        return new R(true,bookService.getById(id));
    }

    @GetMapping("{currentPage}/{size}")
    public R  getPage(@PathVariable int currentPage,@PathVariable int size,Book book){
//        System.out.println(book);
        IPage<Book> page = bookService.getPage(currentPage,size,book);
        //如果当前页码值大于了总页码值，重新执行查询操作，使用最大的页码值
        if((currentPage)>page.getPages()){
            page = bookService.getPage((int) page.getPages(),size,book);
        }
        return new R(true,page);
    }


}
