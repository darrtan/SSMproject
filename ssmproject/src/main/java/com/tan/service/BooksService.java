package com.tan.service;

import com.tan.pojo.Books;


import java.util.List;

public interface BooksService {
    //    增加书籍
    String addBook(Books books);
    //    删除书籍
    int deleteByID(int id);
    //    更新书籍
    int updateBook(Books books);
    //    查询一本书
    Books queryBookByID(int id);
    //    查询全部的书
    List<Books> queryAllBook();
}
