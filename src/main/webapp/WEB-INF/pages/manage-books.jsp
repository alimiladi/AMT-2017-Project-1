<%-- 
    Document   : newjsp
    Created on : 5 oct. 2017, 14:00:14
    Author     : Ali Miladi
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="includes/header.jsp" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Book details</title>
    </head>
    <body>
        <table>
            <c:forEach items="${books}" var="book">
                <tr>
                    <td>${book.isbn}</td>
                    <td>${book.name}</td>
                    <td>${book.author}</td>
                    <td>${book.theme}</td>
                    <td>${book.nbPages}</td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
