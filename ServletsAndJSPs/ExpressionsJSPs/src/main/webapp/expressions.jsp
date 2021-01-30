<%-- 
    Document   : expressions
    Created on : 30 ene. 2021, 15:22:15
    Author     : Sc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP With Expressions</title>
    </head>
    <body>
        <h1>JSP With Expressions</h1>
        Concatenación: <%= "Saludos" + " " + "JSP"%>
        <br>
        Operación Matematica: <%= 2 * 3 / 2%>
        <br>
        Session id : <%= session.getId()%>
        <br>
        <br>
        <a href="index.html">Home</a>
    </body>
</html>
