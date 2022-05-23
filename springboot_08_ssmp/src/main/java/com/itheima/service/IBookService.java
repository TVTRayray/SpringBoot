package com.itheima.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.domain.Book;

import java.util.List;

/**
 * 使用MP简化业务层开发
 */
public interface IBookService extends IService<Book> {
    /**
     * 可以在接口中自定义方法，方法与官方提供方法重名时，需要使用@Override覆盖重载
     *
     */

    IPage<Book> getPage(int currentPage,int size);

    List<Book> getByCondition(String condition);
}
