package net.AhmedAli.springbootlibrary.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import net.AhmedAli.springbootlibrary.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
    
}
