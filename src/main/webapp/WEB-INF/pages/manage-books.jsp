<%-- 
    Document   : newjsp
    Created on : 5 oct. 2017, 14:00:14
    Author     : Ali Miladi
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="includes/header.jsp" %>

<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="ch.heivd.amt.amt2017project1.model.Book"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html">
        <title>Pagination In Servlets - www.javaworkspace.com</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">

        <link rel="stylesheet" href="static/css/style1.css">
    </head>
    <body>

        <%
            List<Book> list = (List) session.getAttribute("bookDetails");

            List<Integer> pageNumbers = (List) session.getAttribute("pages");
            Integer currentPageNo = (Integer) session.getAttribute("curPageNo");

            Integer nextPage = currentPageNo + 1;
            Integer previousPage = currentPageNo - 1;
            if (previousPage == 0) {
                previousPage = 1;
            }
            if (nextPage == pageNumbers.size() + 1) {
                nextPage = pageNumbers.size();
            }
        %>

        <h1>
            Books
        </h1>

    <main>
        <table>
            <thead>
                <tr>
                    <th>
                        ISBN
                    </th>
                    <th>
                        Name
                    </th>
                    <th>
                        author
                    </th>
                    <th>
                        theme
                    </th>
                    <th>
                        # Pages
                    </th>
                </tr>
            </thead>
            <tfoot>
                <tr>
                    <th colspan='3'>
                        Page <%=currentPageNo%>/<%=pageNumbers.size()%>
                    </th>
                    <th colspan='4'>
                        <a href="manage?pageNumber=<%=1%>">&#171;</a>  <a href="manage?pageNumber=<%=previousPage%>">&#60;</a>  <a href="manage?pageNumber=<%=nextPage%>">&#62;</a>   <a href="manage?pageNumber=<%=pageNumbers.size()%>">&#187;</a>
                    </th>
                </tr>
            </tfoot>
            <tbody>
                <%
                    for (int i = 0; i < list.size(); i++) {
                %>
                <tr>
                    <%
                        Book book = (Book) list.get(i);
                        out.println("<td data-title='Provider Name'>" + book.getIsbn() + "</td>");
                        out.println("<td data-title='E-mail'>" + book.getName() + "</td>");
                        out.println("<td data-title='E-mail'>" + book.getAuthor() + "</td>");
                        out.println("<td data-title='E-mail'>" + book.getTheme() + "</td>");
                        out.println("<td data-title='E-mail'>" + book.getNbPages() + "</td>");
                    %>
                    <td class='select'><a class='button' href="update?isbn=<%=book.getIsbn()%>">edit</a></td>
                    <td class='select'><a class='button' href="delete?isbn=<%=book.getIsbn()%>">delete</a></td>
                </tr>
                <%
                    }
                %>

            </tbody>
        </table>
    </main>
    <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>

    <script src="static/js/index.js"></script>
</body>
</html>
