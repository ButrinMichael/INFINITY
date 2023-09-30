
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
            Title <form:select path="title">
            <form:option value="" label="None"/>
            <form:option value="Mr." label="Mr."/>
            <form:option value="Ms." label= "Ms."/>
            <form:option value="Dr." label ="Dr."/>
            <form:option value="Prof." label ="Prof."/>
        </form:select>
        Name <form:input path="name"/>
        
        <br><br>
        Surname <form:input path="surname"/>
         
        <br><br>
        Sex:
        <br>
        Nonbinary <form:radiobutton checked="checked"  path="sex" value="Nonbinary" />
        | Men <form:radiobutton path="sex" value="Men"/>
        | Women <form:radiobutton path="sex" value="Women"/>
        <br><br>
        Age <form:input path="age" type="number" /> <%-- only a number type--%>
        <form:errors path="age"/>
        <br><br>
        Retirement type:
        <br>
        <form:checkboxes path="retirementType" items="${visitor.retirementTypeList}"  delimiter="|" />
        
        <br><br>
        Country<form:select path="country">
            <form:options items="${visitor.countries}"/>
        </form:select>
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
