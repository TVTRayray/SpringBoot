package com.itheima.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itheima.dao.BookDao;
import com.itheima.domain.Book;
import com.itheima.service.IBookService;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IBookServiceImpl extends ServiceImpl<BookDao, Book> implements IBookService {
    @Autowired
    private BookDao bookDao;
    @Override
    public IPage<Book> getPage(int currentPage, int size) {
        IPage<Book> page = new Page(currentPage,size);
        bookDao.selectPage(page,null);
        return page;
    }


    @Override
    public IPage<Book> getPage(int pages, int size, Book book) {
        LambdaQueryWrapper<Book> qw = new LambdaQueryWrapper<Book>();
        qw.like(Strings.isNotEmpty(book.getType()),Book::getType,book.getType());
        qw.like(Strings.isNotEmpty(book.getName()),Book::getName,book.getName());
        qw.like(Strings.isNotEmpty(book.getDescription()),Book::getDescription,book.getDescription());
        IPage page = new Page(pages,size);
        bookDao.selectPage(page,qw);
        return page;

    }
}
