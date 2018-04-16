package ru.octava.javarushtest.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "books")
@Data
public class Book implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank
    private String title;

    private String description;

    @NotBlank
    private String author;

    private String isbn;
    private int print_year;

    @Column(nullable = false, columnDefinition = "TINYINT(4)", length = 1)
    private boolean read_already;

}
