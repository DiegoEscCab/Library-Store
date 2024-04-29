package com.diego.library.services;

import com.diego.library.dto.AuthorDto;
import com.diego.library.model.Author;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FactoryAuthorService {
    public Author createAuthor(AuthorDto authorDto) {
        return new Author(authorDto);
    }

    public AuthorDto createAuthorDto(Author author) {
        return new AuthorDto(author);
    }
    public List<AuthorDto> createAuthorDto(List<Author> authorList) {
        List<AuthorDto> authorDtos = new ArrayList<>();
        authorList.stream().forEach(
                author -> {
                    authorDtos.add(createAuthorDto(author));
                }
        );
        return authorDtos;
    }
}
