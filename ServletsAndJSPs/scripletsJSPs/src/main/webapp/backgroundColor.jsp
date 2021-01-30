<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    String background = request.getParameter("backgroundColor");
    if (background == null || background.trim().equals("")) {
        background = "white";
    }
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Background Color</title>
    </head>
    <body bgcolor="<%=background%>">
        <h1>JSP BackgroundColor</h1>
        <br>
        Color de fondo aplicado: <%=background%>
        <br>
        <a href="index.html">Home</a>
    </body>
</html>
