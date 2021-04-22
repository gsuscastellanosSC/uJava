<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>getter Jsp</title>
    </head>
    <body>
        <h1>getter Jsp!</h1>
        <jsp:useBean id="rectangulo" class="beans.Rectangulo" scope="session"  />
        <br/>
        <br/>
        Valor Base: <jsp:getProperty name="rectangulo" property="base"  />
        <br/>
        Valor Altura: <jsp:getProperty name="rectangulo" property="h"  />
        <br/>
        Valor Area: <jsp:getProperty name="rectangulo" property="area"  />
        <br/>
        <br/>
        <a href="index.jsp">Back To start</a>
    </body>
</html>
