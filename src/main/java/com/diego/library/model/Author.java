package com.diego.library.model;

import com.diego.library.dto.AuthorDto;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name = "authors")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String lastName;
    private String phone;

    public Author(AuthorDto authorDto) {
        this.id = authorDto.getId();
        this.name = authorDto.getName();
        this.lastName = authorDto.getLastName();
        this.phone = authorDto.getPhone();
    }
}
