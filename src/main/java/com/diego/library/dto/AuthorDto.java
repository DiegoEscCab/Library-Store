package com.diego.library.dto;

import com.diego.library.model.Author;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AuthorDto {
    private Integer id;
    private String name;
    private String lastName;
    private String phone;

    public AuthorDto(Author author) {
        this.id = author.getId();
        this.name = author.getName();
        this.lastName = author.getLastName();
        this.phone = author.getPhone();
    }
}
