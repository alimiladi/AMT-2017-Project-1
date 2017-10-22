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
    </head>
    <body>

        <h1>Pagination In Servlets</h1>

        <%
            List<Book> list = (List) session.getAttribute("bookDetails");
        %>

        <%
            List<Integer> pageNumbers = (List) session.getAttribute("pages");
            Integer currentPageNo = (Integer) session.getAttribute("curPageNo");
        %>

        <table border="1">
            <tr bgcolor="orange">
                <td><strong>Book isbn</strong></td>
                <td><strong>Book name</strong></td>
                <td><strong>Book author</strong></td>
                <td><strong>Book theme</strong></td>
                <td><strong>Book nbPages</strong></td>
            </tr>
            <%
                for (int i = 0; i < list.size(); i++) {
            %>
            <tr>
                <%
                    Book book = (Book) list.get(i);
                    out.println("<td>" + book.getIsbn() + "</td>");
                    out.println("<td>" + book.getName() + "</td>");
                    out.println("<td>" + book.getAuthor() + "</td>");
                    out.println("<td>" + book.getTheme() + "</td>");
                    out.println("<td>" + book.getNbPages() + "</td>");
                %>
                <td><a href="update?isbn=<%=book.getIsbn()%>">edit</a></td>
                <td><a href="delete?isbn=<%=book.getIsbn()%>">delete</a></td>
            </tr>
            <%
                }
            %>

            <tr>
                <%
                    Integer nextPage = currentPageNo + 1;
                    Integer previousPage = currentPageNo - 1;
                    if (previousPage == 0) {
                        previousPage = 1;
                    }
                    if (nextPage == pageNumbers.size() + 1) {
                        nextPage = pageNumbers.size();
                    }
                %>
                <td>page <%=currentPageNo%>/<%=pageNumbers.size()%></td>
                <td><a href="manage?pageNumber=<%=1%>">first</a></td>
                <td><a href="manage?pageNumber=<%=previousPage%>">previous</a></td>
                <td><a href="manage?pageNumber=<%=nextPage%>">next</a></td>
                <td><a href="manage?pageNumber=<%=pageNumbers.size()%>">last</a></td>

            </tr>
        </table>
    </body>
</html>
