/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heivd.amt.amt2017project1.services;

import ch.heivd.amt.amt2017project1.model.Book;
import java.util.ArrayList;
import javax.ejb.Local;

/**
 *
 * @author Ali Miladi
 */
@Local
public interface BookManagerLocal {
    public Book createBook(String isbn, String name, String author, String theme, int nbPages);
    public void deleteBook(String isbn);
    public void setName(String isbn, String name);
    public void setAuthor(String isbn, String author);
    public ArrayList<Book> getRandomListOfNBooks(Long n);
    public ArrayList<Book> getAllBooks();
    public void updateBook(String isbn, String name, String author, String theme, int nbPages);
}
