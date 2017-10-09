/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heivd.amt.amt2017project1.model;

/**
 *
 * @author Ali Miladi
 */
public class Book {
    private final String isbn;
    private final String name;
    private final String author;
    private final String theme;
    private final int nbPages;
    
    public Book(String isbn, String name, String author, String theme, int nbPages){
        this.isbn = isbn;
        this.author = author;
        this.name = name;
        this.theme = theme;
        this.nbPages = nbPages;
    }
    
    public String getISBN(){
        return isbn;
    }
    public String getName(){
        return name;
    }
    public String getAuthor(){
        return author;
    }
    public String getTheme(){
        return theme;
    }
    public int getNbPages(){
        return nbPages;
    }
    
}
