package be.vdab;

import be.vdab.Book;

import java.util.List;

public interface BookRepository {
    List<Book> findAllBooks();
}