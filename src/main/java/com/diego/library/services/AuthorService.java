package com.diego.library.services;

import com.diego.library.dto.AuthorDto;
import com.diego.library.repository.RepositoryAuthor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {
    @Autowired
    private FactoryAuthorService factoryAuthorService;
    @Autowired
    private RepositoryAuthor repositoryAuthor;

    public AuthorDto save(AuthorDto authorDto) {
        return factoryAuthorService.createAuthorDto(repositoryAuthor.save(factoryAuthorService.createAuthor(authorDto)));
    }

    public List<AuthorDto> findAll() {
        return factoryAuthorService.createAuthorDto(repositoryAuthor.findAll());
    }

    public AuthorDto findById(Integer id) {
        return factoryAuthorService.createAuthorDto(repositoryAuthor.findById(id).get());
    }

    public void deleteById(Integer id) {
        repositoryAuthor.deleteById(id);
    }
}
