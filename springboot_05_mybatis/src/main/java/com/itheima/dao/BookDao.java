package com.itheima.dao;

import com.itheima.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
/**
 * TODO：必须要加上注解mapper(mybatis官方注解)
 * 注：在SSM中并没在Dao上加@Mapper是因为当时是手动调用了mybatis提供的动态代理获得对象（getMapper）
 *    而在当前SpringBoot中，需要将Dao加入ioc容器中进行统一的对象管理
 */
public interface BookDao {
    @Select("select * from tbl_book where id = #{id}")
    public Book getById(int id);
}
