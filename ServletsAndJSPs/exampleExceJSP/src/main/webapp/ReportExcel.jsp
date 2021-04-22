<%@page errorPage="/WEB-INF/error.jsp" %>
<%@page import="utilities.Conversions, java.util.Date" %>
<%@page contentType="application/vnd.ms-excel"  %>
<%
    String fileName = "report.xls";
    response.setHeader("Content-Disition", "attachement;filename=" + fileName);
%>
<!DOCTYPE html>
<html>
    <head>
        <title>Excel report</title>
    </head>
    <body>
        <h1>Excel report</h1>
        <br/>
        <table border="1">
            <tr>
                <th>Curse</th>
                <th>Description</th>
                <th>Date</th>
            </tr>
            <tr>
                <td>1. Java</td>
                <td>We'll Learn basic syntax java</td>
                <td><%= Conversions.format("500")%></td>
            </tr>
            <tr>
                <td>2. Java</td>
                <td>We'll Learn basic syntax java</td>
                <td><%= Conversions.format(new Date())%></td>
            </tr>
        </table>
    </body>
</html>
