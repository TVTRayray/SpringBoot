package com.itheima.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.domain.Book;
import org.apache.ibatis.annotations.Mapper;

/**
 * 使用MP简化数据层开发
 */
@Mapper
public interface BookDao extends BaseMapper<Book> {

}
