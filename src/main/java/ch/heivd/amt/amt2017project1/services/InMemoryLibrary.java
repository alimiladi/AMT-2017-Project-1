/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heivd.amt.amt2017project1.services;

import ch.heivd.amt.amt2017project1.model.Book;
import java.util.ArrayList;
import java.util.HashMap;
import javax.ejb.Singleton;

/**
 *
 * @author Ali Miladi
 */

@Singleton
public class InMemoryLibrary implements InMemoryLibraryLocal {
    private long bookId = 0;
    private final HashMap<Long, Book> books = new HashMap<>();
    

    @Override
    public Long saveBook(Book book) {
        bookId++;
        books.put(bookId, book);
        return bookId;
    }

    @Override
    public Book loadBook(Long id) {
        return books.get(id);
    }

    @Override
    public ArrayList<Book> loadAllBooks() {
        return (ArrayList)books.values();
    }
    
}
