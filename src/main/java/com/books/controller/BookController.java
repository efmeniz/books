package com.books.controller;

import com.books.model.Book;
import com.books.service.BookService;
import com.util.data.CustomPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class BookController {

    @Autowired
    BookService bookService;

    @RequestMapping(value = "books", method = RequestMethod.GET)
    public CustomPage<Book> list(@RequestParam(value = "page", required = false, defaultValue = "1") Integer page, @RequestParam(value = "limit", required = false, defaultValue = "10") Integer limit) {
        return bookService.listBooksByPageByLimit(page, limit);
    }
}
