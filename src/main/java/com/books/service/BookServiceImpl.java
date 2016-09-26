package com.books.service;

import com.util.data.CustomPage;
import com.books.model.Book;
import com.books.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public CustomPage<Book> listBooksByPageByLimit(int page, int limit) {
        if (page < 1) {
            page = 1;
        }

        if (limit < 1) {
            limit = 10;
        }

        return bookRepository.listBooksByPageByLimit(page, limit);
    }

}
