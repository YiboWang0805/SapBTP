package com.sapTest.boot.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sapTest.boot.bean.Book;

import java.util.List;


public interface BookMapper extends BaseMapper<Book> {

    List<Book> getBook();
}
