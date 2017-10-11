/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heivd.amt.amt2017project1.services;

import ch.heivd.amt.amt2017project1.model.Book;
import java.util.ArrayList;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Ali Miladi
 */
@Stateless
public class BookManager implements BookManagerLocal {
    
    @EJB
    private InMemoryLibraryLocal library;

    @Override
    public Book createBook(String isbn, String name, String author, String theme, int nbPages) {
        Book book = new Book(isbn, name, author, theme, nbPages);
        library.saveBook(book);
        return book;
    }

    @Override
    public void deleteBook(String isbn) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setName(String isbn, String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setAuthor(String isbn, String author) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Book> getRandomListOfNBooks(Long n) {
        ArrayList<Book> booksInLibrary = library.loadAllBooks();
        if(booksInLibrary.size() < n){
            return booksInLibrary;
        }
        ArrayList<Book> randomBooks = new ArrayList<Book>();
        for(int i = 0; i < n; i++){
            randomBooks.add(booksInLibrary.get((int)Math.abs(Math.random())));
        }
        return randomBooks;
    }
    
    
}
