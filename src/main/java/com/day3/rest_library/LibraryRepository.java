package com.day3.rest_library;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LibraryRepository extends JpaRepository<Book, Integer> {
    Optional<Book> findById(Long id);

}
