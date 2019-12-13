package com.tan.service;

import com.tan.dao.BooksMapper;
import com.tan.pojo.Books;

import java.util.List;

public class BooksServiceImpl implements BooksService {


    //    service层调用dao层
    private BooksMapper booksMapper;
    public void setBooksMapper(BooksMapper booksMapper) {
        this.booksMapper = booksMapper;
    }

    public String addBook(Books books) {
        return booksMapper.addBook(books);
    }

    public int deleteByID(int id) {
        return booksMapper.deleteByID(id);
    }

    public int updateBook(Books books) {
        return booksMapper.updateBook(books);
    }

    public Books queryBookByID(int id) {
        return booksMapper.queryBookByID(id);
    }

    public List<Books> queryAllBook() {
        return booksMapper.queryAllBook();
    }
}
