package com.day3.rest_library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibraryService {
    @Autowired
    LibraryRepository libraryRepository;

    public List<Book> getAllBooks() {
        return libraryRepository.findAll();
    }

    public Book getBookById(Long id) {
        Optional<Book> searchedBook = libraryRepository.findById(id);
        return searchedBook.orElse(null);
    }

    public void updateBook(Long id, Book book) {
        if (getBookById(id) != null) {
            libraryRepository.deleteById(Math.toIntExact(id));
            libraryRepository.save(book);
        }
    }

}
