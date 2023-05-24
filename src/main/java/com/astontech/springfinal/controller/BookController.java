package com.astontech.springfinal.controller;

import com.astontech.springfinal.domain.Book;
import com.astontech.springfinal.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BookController {

    @Autowired
    BookService bookService;


    @RequestMapping(value = "/book/viewBooks", method = RequestMethod.GET)
    public String viewBooks(Model model)
    {
        Iterable<Book> allBooks = bookService.listAllBooks();
        model.addAttribute("books", allBooks);
        return "view-books";
    }

    @RequestMapping(value="/book/addBook",method = RequestMethod.GET)
    public String addBookGET(Model model)
    {
        model.addAttribute("book", new Book());
        return "add-book";
    }

    @RequestMapping(value="/book/addBook", method = RequestMethod.POST)
    public String addBookPost(@RequestParam (value = "isbn") String isbn,
                              @RequestParam(value = "name")String name,
                              @RequestParam(value = "author")String author)
    {
        Book newBook = new Book(isbn,name,author);

        bookService.saveBook(newBook);

        return "redirect:/book/viewBooks";
    }

    @RequestMapping(value = "/book/editBook/{isbn}", method = RequestMethod.GET)
    public String editBookGet(@PathVariable String isbn, Model model)
    {
        model.addAttribute("book", bookService.findByISBN(isbn));

        return "edit-book";
    }

    @RequestMapping(value = "/book/deleteBook/{isbn}",method = RequestMethod.DELETE)
    public String deleteBook(@PathVariable String isbn)
    {
        bookService.deleteBook(isbn);

        return "view-books";
    }

    @RequestMapping(value = "/book/editBook/{isbn}", method = RequestMethod.POST)
    public String updateBook()
    {
        return "edit-book";
    }
}
