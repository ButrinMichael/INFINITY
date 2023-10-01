<%-- 
    Document   : value-control
    Created on : Oct 1, 2023, 3:16:14 PM
    Author     : User
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>Sex Values</h2>
        <br>
        <table>
            <tr>
                <th>Sex</th>
                <th>Value</th>
            </tr>
            
            <c:forEach var="sex" items="${allSexValue}">
                <tr>
                    <td> ${sex.sex}</td>
                    <td> ${sex.averageValue}</td>
                    
                </tr>
                
            </c:forEach>
            
        </table>
    </body>
</html>
