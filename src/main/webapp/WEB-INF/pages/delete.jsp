<%-- 
    Document   : delete
    Created on : 21 oct. 2017, 23:36:19
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
            <form method="post" action="delete" id="create-book-form">
                <input type="text" name="delIsbn" placeholder="isbn"><br/>
                <input type="submit" value="delete"> 
            </form>
    </body>
</html>
