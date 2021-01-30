<%-- Agregamos una declaración de JSP--%>
<%!
//Declaramos una variable con su metodo get
    private String user = "Sc";

    public String getUser() {
        return this.user;
    }
//Declaramos un contador de visitas
    private int accVisits = 1;
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Statements JSP</title>
    </head>
    <body>
        <h1>Statements JSP</h1>
        Valor de usuario por medio del atributo <%=this.user%>
        <br>
        Valor de usuario por medio del metodo <%=getUser()%>
        <br>
        Valor del contador de visitas: <%=this.accVisits++%>
    </body>
</html>
