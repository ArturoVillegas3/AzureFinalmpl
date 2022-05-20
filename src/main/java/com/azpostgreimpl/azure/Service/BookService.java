package com.azpostgreimpl.azure.Service;

import com.azpostgreimpl.azure.Entity.Book;

import java.util.List;

public interface BookService {
    List<Book> getAllBooks();

    Book SaveBook(Book book);

    Book GetBookById(Integer id);

    Book EditBook(Book book);

    void deleteBook(Integer id);
}
