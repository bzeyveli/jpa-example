package jpa.repository;

import com.example.jpa.Factory.Factory;
import com.example.jpa.FactoryImpl.JpaFactoryImpl;
import com.example.jpa.model.Book;

public interface BookRepository {

    Factory factory = new JpaFactoryImpl();  // bu şekilde tanımlandığı için static ve final oluyor deger atılamaz

    void create(Book book);

    Book find(Long id);

    Book update(Book book);

    void delete(Long id);
}
