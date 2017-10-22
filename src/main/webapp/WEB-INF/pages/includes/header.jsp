<%-- 
    Document   : header
    Created on : 11 oct. 2017, 13:41:16
    Author     : Ali Miladi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>

	<meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <base href="${pageContext.request.contextPath}/">

	<title>Books App</title>

	<link rel="stylesheet" href="static/css/demo.css">
	<link rel="stylesheet" href="static/css/header-basic.css">
	<link href='http://fonts.googleapis.com/css?family=Cookie' rel='stylesheet' type='text/css'>


</head>

	<body>

		<header class="header-basic">

			<div class="header-limiter">

                            <h1><a href="home">Books<span>App</span></a></h1>
				<nav>
					<a href="create">Create</a>
					<a href="manage">Manage books</a>
					<a href="#">Configuration</a>
				</nav>
			</div>

		</header>

	</body>

</html>
