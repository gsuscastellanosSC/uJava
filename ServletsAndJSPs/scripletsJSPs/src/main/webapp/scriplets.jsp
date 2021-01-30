<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP with Scriplets</title>
    </head>
    <body>
        <h1>JSP with Scriplets</h1>
        <br>
        <%--Scriplet para enviar informaci�n al navegador--%>
        <%
            out.print("Saludos desde un scriplet");
        %>
        <%-- Scriplet para manipular los objetos implicitos--%>
        <%
            String nameApp = request.getContextPath();
            out.print("nombre de la aplicaci�n: " + nameApp);
        %>
        <br>
        <%-- Scriplet con c�digo condicionado--%>
        <%
            if (session != null && session.isNew()) {

        %>
        la session SI es nueva
        <%        } else if (session != null) {
        %>
        la session NO es nueva
        <%
            }
        %>
        <br>
        <a href="index.html">Home</a>
    </body>
</html>
