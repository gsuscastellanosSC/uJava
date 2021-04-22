<%@page isErrorPage="true"%>
<%@page import="java.io.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page Error</title>
    </head>
    <body>
        <h1>JSP Page Error</h1>
        <br/>
        Exception: <%= exception.getMessage()%>
        <br>
        <textarea rows="5" cols="30">
            <% exception.printStackTrace(new PrintWriter(out));%>
        </textarea>
    </body>
</html>
