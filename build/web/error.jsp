<%-- 
    Document   : error
    Created on : Dec 16, 2019, 11:56:27 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link href="css/font-awesome.min.css" rel="stylesheet">
        <link href="css/prettyPhoto.css" rel="stylesheet">
        <link href="css/price-range.css" rel="stylesheet">
        <link href="css/animate.css" rel="stylesheet">
        <link href="css/main.css" rel="stylesheet">
        <link href="css/responsive.css" rel="stylesheet">   
        <script src="js/jquery.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/jquery.scrollUp.min.js"></script>
        <script src="js/price-range.js"></script>
        <script src="js/jquery.prettyPhoto.js"></script>
        <script src="js/main.js"></script>
    </head>
    <body>

        <jsp:include page="header.jsp"></jsp:include>
            <div class="container text-center">          
                <div class="content-404">
                    <img src="images/404/404.png" class="img-responsive" alt="" />
                    <h1><b>OPPS!</b> We Couldn’t Find this Page</h1>
                    <p>Uh... So it looks like you brock something. The page you are looking for has up and Vanished.</p>
                    <h2><a href="index.html">Bring me back Home</a></h2>
                    <div style="clear: both; margin-bottom: 40px;"  ></div>
                </div>
            </div>
        <jsp:include page="footer.jsp"></jsp:include>

    </body>
</html>
