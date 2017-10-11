/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heivd.amt.amt2017project1.web;

import ch.heivd.amt.amt2017project1.model.Book;
import ch.heivd.amt.amt2017project1.services.BookManager;
import ch.heivd.amt.amt2017project1.services.BookManagerLocal;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ali Miladi
 */
public class BookServlet extends HttpServlet implements Serializable {

    @EJB
    private BookManagerLocal manager;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Book book = manager.createBook("ISBN1", "First book", "Ali Miladi", "Action", 400);
        request.setAttribute("book", book);
        request.getRequestDispatcher("/WEB-INF/pages/book.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {}
    }
}



