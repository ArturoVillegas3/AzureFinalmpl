package com.azpostgreimpl.azure.Repository;

import com.azpostgreimpl.azure.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer>{
}
