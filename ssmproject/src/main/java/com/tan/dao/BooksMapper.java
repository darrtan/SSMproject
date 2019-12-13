package com.tan.dao;

import com.tan.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BooksMapper {
//    增加书籍
    String addBook(Books books);
//    删除书籍
    int deleteByID(@Param("bookID") int id);
//    更新书籍
    int updateBook(Books books);
//    查询一本书
    Books queryBookByID(@Param("bookID") int id);
//    查询全部的书
    List<Books> queryAllBook();
}
