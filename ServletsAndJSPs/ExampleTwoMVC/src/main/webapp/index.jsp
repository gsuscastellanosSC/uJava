<!DOCTYPE html>
<html>
    <head>
        <title>Example MVC Two</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <h1>Example MVC Two</h1>
        <br/>
        <br/>
        <div style="color: red">${mensaje}</div>
        <br/>
        <a href="${pageContext.request.contextPath}/ServletController">
            Link al servletController SIN parametros
        </a>
        <br/>
        <a href="${pageContext.request.contextPath}/ServletController?accion=addVariables">
            Link al servletController para agregar las variables
        </a>
        <br/>
        <a href="${pageContext.request.contextPath}/ServletController?accion=listVariables">
            Link al servletController para listar variables
        </a>
    </body>
</html>
