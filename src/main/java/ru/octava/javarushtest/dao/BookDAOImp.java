package ru.octava.javarushtest.dao;

import org.springframework.stereotype.Repository;
import ru.octava.javarushtest.model.Book;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
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
        return entityManager.createQuery("from Book where Book.title =:title", CLASS)
                .setParameter("title", title).getResultList();
    }

    @Override
    public List<Book> getBooksByAuthor(String author) {
        return entityManager.createQuery("from Book where Book.author = :author", CLASS)
                .setParameter("author", author).getResultList();
    }

    @Override
    public void addBook(Book book) {
        entityManager.persist(book);
    }

    @Override
    public void updateBook(Book book) {
        /*entityManager.createQuery("update Books set title =:title," +
                "desription = :description, isbn = :isbn," +
                "print_year = :print_year, read_already = :read_already" +
                " where b.id = :id", CLASS).setParameter("id", book.getId())
                .setParameter("title",book.getTitle()).setParameter("description",book.getDescription())
                .setParameter("isbn", book.getIsbn()).setParameter("read_already",book.isRead_already())
                .setParameter("print_year",book.getPrint_year()).executeUpdate();*/
        entityManager.merge(book);
        return;
    }

    @Override
    public void deleteBook(Book book) {
        entityManager.remove(book);
    }
}
