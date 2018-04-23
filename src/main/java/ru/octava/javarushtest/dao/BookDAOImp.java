package ru.octava.javarushtest.dao;

import org.springframework.stereotype.Repository;
import ru.octava.javarushtest.model.Book;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Repository
public class BookDAOImp implements BookDAO {
    private static final Class<Book> CLASS = Book.class;

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Book> getAllBooks() {
        return entityManager.createQuery("from Book", CLASS).getResultList();
    }

    @Override
    public Book getBookById(int id) {
        return entityManager.find(CLASS,id);
    }

    @Override
    public List<Book> getBookByTitle(String title) {
        return entityManager.createQuery("select b from Book b where lower(b.title) = lower(:title)", CLASS)
                .setParameter("title", title)
                .getResultList();
    }

    @Override
    public List<Book> getBooksByAuthor(String author) {
        return entityManager.createQuery("select b from Book b where lower(b.author) = lower(:author)", CLASS)
                .setParameter("author", author)
                .getResultList();
    }

    @Override
    public void addBook(Book book) {
        entityManager.persist(book);
    }

    @Override
    public void updateBook(Book book) {
        entityManager.merge(book);
        return;
    }

    @Override
    public void deleteBook(Book book) {
        entityManager.remove(book);
    }
}
