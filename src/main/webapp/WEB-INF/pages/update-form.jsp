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
        <div class="form">
            <div class="tab-content">
                <div id="signup">   
                    <h1>Update a book</h1>
                    <form action="update?isbn=${isbn}" method="post">          
                        <div class="top-row">

                            <div class="field-wrap">
                                <label>
                                    ${isbn}<span class="req"></span>
                                </label>
                                <br/>
                            </div>

                            <div class="field-wrap">
                                <label>
                                    Name<span class="req">*</span>
                                </label>
                                <input type="text" name="name" required autocomplete="off"/>
                            </div>
                        </div>
                        <br/>

                        <div class="field-wrap">
                            <label>
                                Author<span class="req">*</span>
                            </label>
                            <input type="text" name="author" required autocomplete="off"/>
                        </div>

                        <div class="field-wrap">
                            <label>
                                Theme<span class="req">*</span>
                            </label>
                            <input type="text" name="theme" required autocomplete="off"/>
                        </div>

                        <div class="field-wrap">
                            <label>
                                Number of pages<span class="req">*</span>
                            </label>
                            <input type="text" name="nbPages" required autocomplete="off"/>
                        </div>

                        <button type="submit" class="button button-block"/>Update</button>

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