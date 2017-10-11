<%-- 
    Document   : newjsp
    Created on : 5 oct. 2017, 14:00:14
    Author     : Ali Miladi
--%>

<%@include file="includes/header.jsp" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Book details</title>
    </head>
    <body>
        <h1>books</h1>
        ${requestScope.book.name} BY ${requestScope.book.author}
    </body>
</html>
