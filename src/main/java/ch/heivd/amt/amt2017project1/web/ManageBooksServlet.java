/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heivd.amt.amt2017project1.web;

import ch.heivd.amt.amt2017project1.model.Book;
import ch.heivd.amt.amt2017project1.services.BookManagerLocal;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Ali Miladi
 */
@WebServlet(name = "ManageBooksServlet", urlPatterns = {"/manage"})
public class ManageBooksServlet extends HttpServlet {

    int offset;
    int length;

    int currentPageNo = 1;

    List<Book> list;
    

    @EJB
    BookManagerLocal bm;

    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {

        int maxEntriesPerPage = 3;
        int page = 1;

        String pageNumberValue = request.getParameter("pageNumber");

        if (pageNumberValue != null) {
            try {
                page = Integer.parseInt(pageNumberValue);
                System.out.println("Page Number:" + page);
                currentPageNo = page;
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
        int offset = maxEntriesPerPage * (page - 1);
        TestList(offset, maxEntriesPerPage);

        HttpSession httpSession = request.getSession();
        httpSession.setAttribute("curPageNo", currentPageNo);
        httpSession.setAttribute("pages", getPages());
        httpSession.setAttribute("bookDetails", getListByOffsetAndLength());

        request.getRequestDispatcher("WEB-INF/pages/manage-books.jsp").forward(request, response);
    }

    /**
     * Hard-coded sample data. Normally this would come from a real data source
     * such as a database
     */
    public List<Book> fillList() {
        list = new ArrayList();
        list.addAll(bm.getAllBooks());
        return list;
    }

    /**
     * @param offset
     * @param length
     */
    public void TestList(int offset, int length) {
        this.offset = offset;
        this.length = length;
        fillList();
    }

    /**
     * @return List
     */
    public ArrayList<Book> getListByOffsetAndLength() {

        ArrayList<Book> arrayList = new ArrayList();
        int to = this.offset + this.length;
        if (this.offset > list.size()) {
            this.offset = list.size();
        }
        if (to > list.size()) {
            to = list.size();
        }
        for (int i = this.offset; i < to; i++) {
            arrayList.add((Book) list.get(i));
        }
        return arrayList;
    }

    /**
     * @return List with page numbers
     */
    public List<Integer> getPages() {
        List<Integer> pageNumbers = new ArrayList();
        int pages = list.size() / this.length;
        if (list.size() % this.length != 0) {
            pages = pages + 1;
        }

        for (int i = 1; i <= pages; i++) {
            pageNumbers.add(new Integer(i));
        }
        return pageNumbers;
    }
}
