package com.azpostgreimpl.azure.Service.Impl;

import com.azpostgreimpl.azure.Entity.Book;
import com.azpostgreimpl.azure.Repository.BookRepository;
import com.azpostgreimpl.azure.Service.BookService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    private BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        super();
        this.bookRepository = bookRepository;
    }

    @Override
    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }

    @Override
    public Book SaveBook(Book book){ return bookRepository.save(book);}

    @Override
    public Book GetBookById(Integer id){
        return bookRepository.findById(id).get();
    }

    @Override
    public Book EditBook(Book book){
        return bookRepository.save(book);
    }

    @Override
    public void deleteBook(Integer id){
        bookRepository.deleteById(id);
    }
}