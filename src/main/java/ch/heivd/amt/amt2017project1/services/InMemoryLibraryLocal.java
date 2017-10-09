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
public interface InMemoryLibraryLocal {
    public Long saveBook(Book book);
    public Book loadBook(Long id);
    
    public ArrayList<Book> loadAllBooks();
}
