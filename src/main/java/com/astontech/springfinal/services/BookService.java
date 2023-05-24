package com.astontech.springfinal.services;

import com.astontech.springfinal.domain.Book;

public interface BookService {

    Iterable<Book> listAllBooks();

    Book findBookName(String name);

    Book findByISBN(String isbn);

    Book findBookById(Integer id);

    Book saveBook(Book book);

    Book updateBook(Book book);

    void deleteBook(Integer id);

    void deleteBook(String isbn);

}
