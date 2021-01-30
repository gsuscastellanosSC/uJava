<%-- 
    Document   : index
    Created on : 30 ene. 2021, 14:40:13
    Author     : Sc
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hello world JSP</title>
    </head>
    <body>
        <h1>Hello world JSP!</h1>
        <ul>
            <li><% out.print("Hello world JSP");%></li>
            <li>${"Hello world JSP with Expression Lenguage (EL)"}</li>
            <li><%="Hello world JSP with Expression"%></li>
            <li><c:out value="Hello world JSP with JSLT"/></li>
        </ul>
    </body>
</html>
