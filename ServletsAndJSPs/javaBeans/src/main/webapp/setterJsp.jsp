<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Setter JSP</title>
    </head>
    <body>
        <h1>Setter JSP</h1>
        <jsp:useBean id="rectangulo" class="beans.Rectangulo" scope="session"/>
        Modificamos los atributos:
        <br/>
        <br/>
        <%
            int baseValue = 5;
            int hValue = 10;
        %>
        <jsp:setProperty name="rectangulo" property="base" value="<%=baseValue%>" />
        <br/>
        <jsp:setProperty name="rectangulo" property="h" value="<%=hValue%>" />
        <br/>  
        Nuevo valor base : <%=baseValue%>
        <br/>  
        Nuevo valor Altura : <%=hValue%>
        <br/>
        <br/>
        <a href="index.jsp">Back To start</a>
    </body>
</html>
