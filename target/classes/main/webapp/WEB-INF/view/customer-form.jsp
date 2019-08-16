<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE HTML>

<html>
<head>
    <title>Customer Registration Form</title>
    <style>
        .error {color:red}
    </style>
</head>
<body>
<i>Fill out the form. Asterisk(*) means required </i>

<form:form action="processForm" modelAttribute="customer">
    First Name (*): <form:input path="firstName" />
    <form:errors path="firstName" cssClass="error" />
    <br><br>
    Last Name: <form:input path="lastName" />


    <br><br>
    <input type="submit" value="Submit">
</form:form>
</body>
</html>
