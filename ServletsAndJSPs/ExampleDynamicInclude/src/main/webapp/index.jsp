<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Example Dynamic Include</title>
    </head>
    <body>
        <h1>Example Dynamic Include</h1>
        <jsp:include page="pages/publicResource.jsp" />
        <br/>
        <jsp:include page="WEB-INF/privateResource.jsp">
            <jsp:param name="colorFondo" value="yellow"/>
        </jsp:include>
    </body>
</html>
