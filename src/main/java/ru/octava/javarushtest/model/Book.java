package ru.octava.javarushtest.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Entity
@Table(name = "books")
public class Book implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String title;

    private String description;

    @NotBlank
    private String author;

    private String isbn;

    private int print_year;

    @Column(nullable = false, columnDefinition = "TINYINT(4)", length = 1)
    private boolean read_already;

    public Book() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getPrint_year() {
        return print_year;
    }

    public void setPrint_year(int print_year) {
        this.print_year = print_year;
    }

    public boolean isRead_already() {
        return read_already;
    }

    public void setRead_already(boolean read_already) {
        this.read_already = read_already;
    }
}
