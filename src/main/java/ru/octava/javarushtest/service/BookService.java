package ru.octava.javarushtest.service;

import org.springframework.stereotype.Service;
import ru.octava.javarushtest.dao.BookDAO;
import ru.octava.javarushtest.model.Book;

import java.util.List;


@Service
public class BookService {
    private BookDAO bookDAO;

    public BookService(BookDAO bookDAO) {
        this.bookDAO = bookDAO;
    }

   public List<Book> getAllBooks(){
        return bookDAO.getAllBooks();
   }

   public Book getBookById(int id){
        return bookDAO.getBookById(id);
   }
   /* List<Book> getBookByTitle(String title);
    List<Book> getBooksByAuthor(String author);

    void addBook(Book book);
    void updateBook(Book book);
    void deleteBook(Book book);*/
}
