package ru.octava.javarushtest.dao;

import ru.octava.javarushtest.model.Book;
import java.util.List;

public interface BookDAO {
    List<Book> getAllBooks();
    Book getBookById(int id);
    List<Book> getBookByTitle(String title);
    List<Book> getBooksByAuthor(String author);

    void addBook(Book book);
    void updateBook(Book book);
    void deleteBook(Book book);

}
