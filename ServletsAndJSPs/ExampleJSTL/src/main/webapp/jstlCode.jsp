<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSTL Core</title>
    </head>
    <body>
        <h1>JSTL Core</h1>
        <!-- Manipulación de variables -->
        <!-- Definimos la variable -->
        <c:set var="nombre" value="Ernesto" />
        <!-- Desplegamos el valor de la variable-->
        Variable nombre: <c:out value="${nombre}"/>
        </br>
        </br>
        Variable con codigo html:
        <c:out value="<h4>Hola</h4>" escapeXml="false"/>
        </br>
        </br>
        <!-- Codigo condicional, uso de if-->
        <c:set var="bandera" value="true" />

        <c:if test="${bandera}">
            La bandera es verdadera
        </c:if>
        </br>
        <c:if test="${param.opcion != null}">
            <c:choose>
                <c:when test="${param.opcion == 1}">
                    <br/>
                    Opcion 1 seleccionada
                </c:when>
                <c:when test="${param.opcion == 2}">
                    <br/>
                    Opcion 2 seleccionada
                </c:when>
                <c:otherwise>
                    <br/>
                    Opcion Propocionada desconocida: ${param.opcion}
                </c:otherwise>
            </c:choose>
        </c:if>
        <!--iteración de un arreglo-->
        <%
            String nombres[] = {"Claudia", "Pedro", "Juan"};
            request.setAttribute("nombresRequest", nombres);
        %>
        <br/>
        <br/>
        <ul>
            <c:forEach var="persona" items="${nombresRequest}">
                <li>Nombre: ${persona}</li>
            </c:forEach>
        </ul>
        <a href="index.jsp">Back to start</a>
    </body>
</html>
