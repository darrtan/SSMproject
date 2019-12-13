package com.tan.controller;

import com.tan.pojo.Books;
import com.tan.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
//controller调用service层
    @Autowired
    @Qualifier("booksServiceImpl")
    private BooksService booksService;

//    查询全部书籍
    @RequestMapping("/allBook")
    public String list(Model model){
        List<Books> list=booksService.queryAllBook();
        model.addAttribute("list",list);
        return "allBook";
    }
    @RequestMapping("/toAddBook")
    public String toAddPaper() {
        return "addBook";
    }

    @RequestMapping("/addBook")
    public String addPaper(Books books) {
        System.out.println(books);
        booksService.addBook(books);
        return "redirect:/book/allBook";
    }

    @RequestMapping("/toUpdateBook")
    public String toUpdateBook(Model model, int id) {
        Books books = booksService.queryBookByID(id);
        System.out.println(books);
        model.addAttribute("book",books );
        return "updateBook";
    }

    @RequestMapping("/del/{bookId}")
    public String deleteBook(@PathVariable("bookId") int id) {
        booksService.deleteByID(id);
        return "redirect:/book/allBook";
    }

    @RequestMapping("/updateBook")
    public String updateBook(Model model, Books book) {
        System.out.println(book);
        booksService.updateBook(book);
        Books books = booksService.queryBookByID(book.getBookID());
        model.addAttribute("books", books);
        return "redirect:/book/allBook";
    }


}
