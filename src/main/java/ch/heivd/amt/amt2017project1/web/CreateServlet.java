/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heivd.amt.amt2017project1.web;

import ch.heivd.amt.amt2017project1.services.BookManagerLocal;
import java.io.IOException;
import java.io.PrintWriter;
import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 *
 * @author Ali Miladi
 */
public class CreateServlet extends HttpServlet {
    
    @EJB
    BookManagerLocal bm;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("WEB-INF/pages/create.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        String isbn = request.getParameter("isbn");
        String name = request.getParameter("name");
        String author = request.getParameter("author");
        String theme = request.getParameter("theme");
        int nbPages = Integer.parseInt(request.getParameter("nbPages"));
        bm.insertBook(isbn, name, author, theme, nbPages);
        request.getRequestDispatcher("WEB-INF/pages/home.jsp").forward(request, response);
    }

}
