package com.diego.library.model;

import com.diego.library.dto.BookDto;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
@Data
@NoArgsConstructor
@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String isbn;
    private String name;
    private String editorial;
    private String genre;
    private int pagesNumber;
    private BigDecimal price;
    private LocalDate editionDate;
    @ManyToOne
    private Author author;

    public Book(BookDto bookDto) {
        this.id = bookDto.getId();
        this.isbn = bookDto.getIsbn();
        this.name = bookDto.getName();
        this.editorial = bookDto.getEditorial();
        this.genre = bookDto.getGenre();
        this.pagesNumber = bookDto.getPagesNumber();
        this.price = bookDto.getPrice();
        this.editionDate = bookDto.getEditionDate();
        this.author = new Author(bookDto.getAuthorDto());
    }
}
