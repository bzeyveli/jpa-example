package jpa.test;

import jpa.RepositoryImpl.BookRepositoryImpl;
import jpa.model.Book;

import java.util.Calendar;
import java.util.Date;

public class Test {
    public static void main(String[] args){

        Book book = new Book(null,"harry potter",350,"Bekir",createCustomDate(12,05,1992));
        Book book2 = new Book(null,"Yüzüklerin Efendisi",101,"Ahmet",createCustomDate(05,04,1900));
        BookRepositoryImpl bookRepository = new BookRepositoryImpl();
        bookRepository.create(book);

        Book book1 = bookRepository.find(100L);

        bookRepository.update(book2);

        bookRepository.delete(100L);
     }

    public static Date createCustomDate(int day, int month, int year){

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, day);
        calendar.set(Calendar.MONTH,month);
        calendar.set(Calendar.YEAR, year);
        return  calendar.getTime();
    }
}
