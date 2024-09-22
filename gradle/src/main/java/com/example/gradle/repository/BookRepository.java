package com.example.gradle.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.gradle.domain.Book;

import java.util.UUID;

public interface BookRepository extends JpaRepository<Book, UUID> {

}
