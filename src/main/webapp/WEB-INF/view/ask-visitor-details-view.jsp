
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
    <html>


<body>
    <style>
body {
  color: red;
}
p {text-align: center;}
</style>
    <p>Please enter your details</p>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
        <form:form action ="showDetails" modelAttribute="visitor">
        Name <form:input path="name"/>
        <br><br>
        Surname <form:input path="surname"/>
        <br><br>
        Age <form:input path="age"/>
        <br><br>
        <input type="submit" value="OK"/>
    </form:form>
    
        <%--This version without extra class--%>       
<!-- <form action="showDetails" method="get">
        <input type="text" name="visitorName"
               placeholder="Write your name"/>
        
        <input type="submit" value="OK"/>
</form>-->
        
        
    
</body>
</html>
