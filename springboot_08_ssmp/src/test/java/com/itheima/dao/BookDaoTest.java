package com.itheima.dao;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itheima.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookDaoTest {
    @Autowired
    private BookDao bookDao;
    @Test
    void testGetById(){
        System.out.println(bookDao.selectById(1));
    }

    @Test
    void testDelete(){
        System.out.println(bookDao.deleteById(8));
    }

    @Test
    void testSave(){
        Book book = new Book();
        book.setDescription("test");
        book.setName("test");
        book.setType("test");
        bookDao.insert(book);
    }

    @Test
    void testUpdate(){
        Book book = new Book();
        book.setId(10);
        book.setDescription("test");
        book.setName("test111");
        book.setType("test");
        bookDao.updateById(book);
    }

    @Test
    void testGetAll(){
        bookDao.selectList(null);
    }

    @Test
    void testGetPage(){
        /**
         * 分页功能需要使用Page实现IPage接口
         * 本质是在select 语句后面拼接limit 1,5进行实现，需要手动开启，配置拦截器实现
         *
         */
        IPage page = new Page(2,5);
        bookDao.selectPage(page,null);
//        IPage iPage = bookDao.selectPage(page, null);
        /**
         * 返回的对象还是Page
         * Method：
         *          getPages:总页数
         *          getTotal:总条数
         *          getCurrent:当前页码
         *          getRecords:当前页的数据
         *          getSize:当前页总条数
         */
        System.out.println(page.getPages());
        System.out.println(page.getCurrent());
        System.out.println(page.getRecords());
        System.out.println(page.getTotal());
        System.out.println(page.getSize());

    }

    @Test
    void testGetByCondition(){
        /*
          queryWrapper：查询条件的对象
         */

        QueryWrapper<Book> qw = new QueryWrapper<>();
        qw.like("name","Spring");
        qw.equals("Spring");
        bookDao.selectList(qw);
    }

    @Test
    void testGetByCondition1(){
        /**
         * 动态sql语句查询
         */
//        传入String进行条件查询（可能为空）
        String name = null;
        LambdaQueryWrapper<Book> qw = new LambdaQueryWrapper<>();
//        此时会将null转换成字符串进行查询
//        qw.like(Book::getName,name);

        /**
         * LIKE '%值%'
         *
         * @param condition 执行条件
         * @param column    字段
         * @param val       值
         * @return children
         */
//        Children like(boolean condition, R column, Object val);
        qw.like(name != null,Book::getName,name);
        bookDao.selectList(qw);
    }
}
