<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!<!doctype html>
<html>
    <body>
        
        <h2>Allright, your DATA is:  </h2>
           <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <%--  Name: ${param.visitorName} --%>
    
    Full Name: ${visitor.name} ${visitor.surname}
    <br>
    <br>
    Sex: ${visitor.sex}
    <br>
    <br>
    Age: ${visitor.age}
    <br>
    <br>
    Retirement(s):
    <ul>
        <c:forEach var="lang" items="${visitor.retirementType}">
                   <li>${lang}</li>
        </c:forEach>
    </ul>
    <br>
    <br>
    Country: ${visitor.country} 
    
    </body>
    <center>  <a href="/infinity">to first page</a></center>
    
    
</html>
