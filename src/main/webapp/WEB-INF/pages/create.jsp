<%-- 
    Document   : create
    Created on : 21 oct. 2017, 19:47:56
    Author     : Ali Miladi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="includes/header.jsp" %>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create a book</title>
    </head>
    <body>
        <div align="center">
            <form method="post" action="create" id="create-book-form">
                <input type="text" placeholder="ISBN" name="isbn" required><br/>
                <input type="text" placeholder="name" name="name" required><br/>
                <input type="text" placeholder="author" name="author" required><br/>
                <input type="text" placeholder="theme" name="theme" required><br/>
                <input type="text" placeholder="number of pages" name="nbPages" required><br/>
                <input type="submit" value="create"><br/>
            </form>
        </div>
    </body>
</html>
