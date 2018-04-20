package ru.octava.javarushtest.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
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
   public List<Book> getBookByTitle(String title){
        return bookDAO.getBookByTitle(title);
   }
   public List<Book> getBooksByAuthor(String author){
        return bookDAO.getBooksByAuthor(author);
   }

   @Transactional
    public void addBook(String title, String author, String isbn, int print_year, boolean read_already, String description){
        if (title != null && author != null) {
            Book book = new Book();
            book.setTitle(title);
            book.setAuthor(author);
            book.setIsbn(isbn);
            book.setPrint_year(print_year);
            book.setRead_already(read_already);
            book.setDescription(description);
            bookDAO.addBook(book);
        }
    }

    @Transactional
    public void updateBook(Book book){
        bookDAO.updateBook(book);
    }

    @Transactional
    public void deleteBook(Book book){
        bookDAO.deleteBook(book);
    }
}
