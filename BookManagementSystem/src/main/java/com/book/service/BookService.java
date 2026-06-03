package com.book.service;

import com.book.dao.BookDao;
import com.book.model.Book;

public class BookService {

    BookDao dao = new BookDao();

    public void addBook(Book book) {
        dao.addBook(book);
    }
}
