package com.learn.inheritence;

import java.util.List;

public class Library {

    public List<Book> bookList;

    public Library(List<Book> bookList) {
        this.bookList = bookList;
    }

    public List<Book> getBookList() {
        return bookList;
    }
}
