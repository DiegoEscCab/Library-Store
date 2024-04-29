package com.diego.library.services;

import com.diego.library.dto.BookDto;
import com.diego.library.model.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FactoryBookService {

    public Book createBook(BookDto bookDto) {
        return new Book(bookDto);
    }
    public BookDto createBookDto(Book book) {
        return new BookDto(book);
    }

    public List<BookDto> createBooksDto(List<Book> books) {
        List<BookDto> bookDtos = new ArrayList<>();
        books.stream().forEach(
                book -> {
                    bookDtos.add(new BookDto(book));
                }
        );
        return bookDtos;
    }
}

