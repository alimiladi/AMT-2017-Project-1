<%-- 
    Document   : update-form
    Created on : 22 oct. 2017, 01:14:41
    Author     : Ali Miladi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="includes/header.jsp" %>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update a book</title>
    </head>
    <body>
        <div align="center">
            <form method="post" action="update" id="create-book-form">
                <label> ${isbn} </label><br/>
                <input type="text" placeholder="name" name="name" required><br/>
                <input type="text" placeholder="author" name="author" required><br/>
                <input type="text" placeholder="theme" name="theme" required><br/>
                <input type="text" placeholder="number of pages" name="nbPages" required><br/>
                <input type="submit" value="update"><br/>
            </form>
        </div>
    </body>
</html>