/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heivd.amt.amt2017project1.services;

import ch.heivd.amt.amt2017project1.model.Book;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.sql.DataSource;

/**
 *
 * @author Ali Miladi
 */
@Stateless
public class BookManager implements BookManagerLocal {

    @Resource(lookup = "jdbc/books")
    private DataSource dataSource;

    @Override
    public Book createBook(String isbn, String name, String author, String theme, int nbPages) {
        Connection cn;
        try {
            cn = dataSource.getConnection();
            String query = "INSERT INTO book"
                    + "(isbn, name, author, theme, nbPages) "
                    + "VALUES "
                    + "('"
                    + isbn + "', '"
                    + name + "', '"
                    + author + "', '"
                    + theme + "', '"
                    + nbPages
                    + "');";
            PreparedStatement ps = cn.prepareStatement(query);
            //System.out.println(query);

            int row = ps.executeUpdate(query);

        } catch (SQLException ex) {
            Logger.getLogger(BookManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return new Book(isbn, name, author, theme, nbPages);
    }

    @Override
    public void deleteBook(String isbn) {
        boolean exist = exist(isbn);
        if (exist(isbn)) {
            String query = "DELETE FROM book WHERE isbn = '" + isbn + "';";
            PreparedStatement ps;
            try {
                Connection conn = dataSource.getConnection();
                ps = conn.prepareStatement(query);
                int up = ps.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(BookManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private boolean exist(String isbn) {
        boolean exist = false;
        try {
            Connection conn = dataSource.getConnection();
            String query = "SELECT * FROM book WHERE isbn = '" + isbn + "';";
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            exist = rs.next();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(BookManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return exist;
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
//        ArrayList<Book> booksInLibrary = library.loadAllBooks();
//        if (booksInLibrary.size() < n) {
//            return booksInLibrary;
//        }
//        ArrayList<Book> randomBooks = new ArrayList<Book>();
//        for (int i = 0; i < n; i++) {
//            randomBooks.add(booksInLibrary.get((int) Math.abs(Math.random())));
//        }
//        return randomBooks;
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public ArrayList<Book> getAllBooks() {
        ArrayList<Book> books = new ArrayList();
        try {
            Connection conn = dataSource.getConnection();
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM book");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String isbn = rs.getString("isbn");
                String name = rs.getString("name");
                String author = rs.getString("author");
                String theme = rs.getString("theme");
                int nbPages = rs.getInt("nbPages");
                books.add(new Book(isbn, name, author, theme, nbPages));
            }
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(BookManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return books;
    }

    @Override
    public void updateBook(String isbn, String name, String author, String theme, int nbPages) {
        if (exist(isbn)) {
            try {
                Connection conn = dataSource.getConnection();
                String query = "UPDATE book SET"
                        + " name='" + name
                        + "', author='" + author
                        + "', theme='" + theme
                        + "', nbPages='" + nbPages
                        + "' WHERE isbn='" + isbn
                        + "';";
                PreparedStatement ps = conn.prepareStatement(query);
                System.out.println(query);

                int row = ps.executeUpdate(query);

            } catch (SQLException ex) {
                Logger.getLogger(BookManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            Logger.getLogger(BookManager.class.getName()).log(Level.SEVERE, null, "No such isbn");
        }
    }

}
