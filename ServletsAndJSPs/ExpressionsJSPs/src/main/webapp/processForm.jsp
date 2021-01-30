<%-- 
    Document   : processForm
    Created on : 30 ene. 2021, 15:22:46
    Author     : UserQV
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Process Form</title>
    </head>
    <body>
        <h1>Process Form</h1>
        Usuario: <%= request.getParameter("user")%>
        <br>
        Password: <%= request.getParameter("password")%>
        <br>
        <br>
        <a href="index.html">Home</a>
    </body>
</html>
