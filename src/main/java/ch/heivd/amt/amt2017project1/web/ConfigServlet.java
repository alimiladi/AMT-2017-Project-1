/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heivd.amt.amt2017project1.web;

import ch.heivd.amt.amt2017project1.services.BookManagerLocal;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ali Miladi
 */
public class ConfigServlet extends HttpServlet {
    
    @EJB
    BookManagerLocal bm;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("WEB-INF/pages/config.jsp").forward(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int numBooks = Integer.parseInt(request.getParameter("numBooks"));
        for (int i = 1; i <= numBooks; i++){
            bm.insertBook(bm.getRandomBook());
        }
        request.getRequestDispatcher("WEB-INF/pages/home.jsp").forward(request, response);
    }

}
