package com.books.service;

import com.util.data.CustomPage;
import com.books.model.Book;

public interface BookService {
    CustomPage<Book> listBooksByPageByLimit(int page, int limit);
}
