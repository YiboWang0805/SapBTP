package com.sapTest.boot.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sapTest.boot.bean.Book;

import java.util.List;

/**
 *  Service 的CRUD也不用写了
 */
public interface BookService {

    List<Book>  getBook();

}
