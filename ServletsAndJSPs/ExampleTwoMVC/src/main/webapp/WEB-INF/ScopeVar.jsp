<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Scope Var</title>
    </head>
    <body>
        <h1>Scope Var</h1>
        <br/>
        Variable request:
        <br/>
        Base: ${rectanguloRequest.base}
        <br/>
        Altura: ${rectanguloRequest.h}
        <br/>
        <br/>
        Variable session:
        <br/>
        Base: ${rectanguloSession.base}
        Altura: ${rectanguloSession.h}
        <br/>
        <br/>
        Variable app:
        <br/>
        Base: ${rectanguloApp.base}
        <br/>
        Altura: ${rectanguloApp.h}
        <br/>
        <br/>
        <a href="${pageContext.request.contextPath}/index.jsp">Back To Home</a>
    </body>
</html>
