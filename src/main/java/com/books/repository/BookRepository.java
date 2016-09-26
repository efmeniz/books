package com.books.repository;

import com.util.data.CustomPage;
import com.books.model.Book;
public interface BookRepository {
    CustomPage<Book> listBooksByPageByLimit(int page, int limit);
}
