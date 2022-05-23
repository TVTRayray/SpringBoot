package com.itheima.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itheima.dao.BookDao;
import com.itheima.domain.Book;
import com.itheima.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public List<Book> getByCondition(String condition) {
        LambdaQueryWrapper<Book> qw = new LambdaQueryWrapper<>();
        qw.like(condition != null,Book::getName,condition);
        return bookDao.selectList(qw);
    }
}
