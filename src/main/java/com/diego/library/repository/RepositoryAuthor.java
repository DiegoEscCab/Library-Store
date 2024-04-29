package com.diego.library.repository;

import com.diego.library.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryAuthor extends JpaRepository<Author, Integer> {
}
