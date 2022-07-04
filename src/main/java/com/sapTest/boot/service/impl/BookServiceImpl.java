package com.sapTest.boot.service.impl;

import com.sapTest.boot.bean.Book;
import com.sapTest.boot.mapper.BookMapper;
import com.sapTest.boot.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    BookMapper bookMapper;

    public List<Book> getBook(){

        return bookMapper.getBook();
    }
}
