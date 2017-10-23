<%-- 
    Document   : config
    Created on : 23 oct. 2017, 19:30:17
    Author     : Ali Miladi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="includes/header.jsp" %>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Generate random books</title>
    </head>
    <body>
        <!--<div align="center">
            <form method="post" action="config" id="create-book-form">
                <input type="text" placeholder="number of books" name="numBooks" required><br/>
                <input type="submit" value="generate random" ><br/>
            </form>
        </div>-->
        <div class="form">
            <div class="tab-content">
                <div id="signup">   
                    <h1>Generate random books</h1>
                    <form action="config" method="post">          
                        <div class="top-row">

                            <div class="field-wrap">
                                <label>
                                    Number of books<span class="req"></span>
                                </label>
                                <input type="text" name="numBooks" required autocomplete="off" />
                            </div>
                            <br/>
                        </div>
                        <br/>
                        <button type="submit" class="button button-block"/>Generate</button>

                    </form>
                </div>

                <div id="login">   
                    <h1>Welcome Back!</h1>

                    <form action="/" method="post">

                        <div class="field-wrap">
                            <label>
                                Email Address<span class="req">*</span>
                            </label>
                            <input type="email"required autocomplete="off"/>
                        </div>

                        <div class="field-wrap">
                            <label>
                                Password<span class="req">*</span>
                            </label>
                            <input type="password"required autocomplete="off"/>
                        </div>

                        <p class="forgot"><a href="#">Forgot Password?</a></p>

                        <button class="button button-block"/>Log In</button>

                    </form>

                </div>

            </div><!-- tab-content -->

        </div> <!-- /form -->
        <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
        <script  src="static/js/index.js"></script>
    </body>
</html>
