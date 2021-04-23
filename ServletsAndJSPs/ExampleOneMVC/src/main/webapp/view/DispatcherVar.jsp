<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Dispatcher Var</title>
    </head>
    <body>
        <h1>Dispatcher Var</h1>
        Variable en el alcance de request: ${message}
        <br/>
        <br/>
        <h2>Variables en el alcance de session:</h2>
        <h3>Rectangulo:</h3>
        Base: ${rectangulo.base}
        <br/>
        Altura: ${rectangulo.h}
        <br/>
        Area: ${rectangulo.area}
        <br/>
        <br/>
        <a href="${pageContext.request.contextPath}/index.jsp">Back To Home</a>
    </body>
</html>
