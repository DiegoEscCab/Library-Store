package com.diego.library.dto;

import com.diego.library.model.Book;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@NoArgsConstructor
public class BookDto {
    private Integer id;
    private String isbn;
    private String name;
    private String editorial;
    private String genre;
    private int pagesNumber;
    private BigDecimal price;
    private LocalDate editionDate;
    private AuthorDto authorDto;

    public BookDto(Book book) {
        this.id = book.getId();
        this.isbn = book.getIsbn();
        this.name = book.getName();
        this.editorial = book.getEditorial();
        this.genre = book.getGenre();
        this.pagesNumber = book.getPagesNumber();
        this.price = book.getPrice();
        this.editionDate = book.getEditionDate();
        this.authorDto = new AuthorDto(book.getAuthor());
    }
}
