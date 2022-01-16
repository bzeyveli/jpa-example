package jpa.RepositoryImpl;

import com.example.jpa.model.Book;
import com.example.jpa.repository.BookRepository;
import jpa.model.Book;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class BookRepositoryImpl implements BookRepository {

    EntityManager entityManager = factory.getEntityManager();
    EntityTransaction transaction = factory.getEntityTransaction();

    @Override
    public void create(Book book) {
        transaction.begin();
        entityManager.persist(book);
        transaction.commit();
    }

    public Book find(Long id) {
       Book book = entityManager.find(Book.class,id);
       if(book != null){
           return book;
       }else{
           return null;
       }
    }

    @Override
    public Book update(Book book) {
        transaction.begin();
        Book book1 = entityManager.merge(book);
        transaction.commit();
        return book1;
    }

    @Override
    public void delete(Long id) {
        transaction.begin();
        entityManager.remove(id);
        transaction.commit();
    }
}
