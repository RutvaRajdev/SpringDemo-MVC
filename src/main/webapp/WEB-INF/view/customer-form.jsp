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
<br><br>

<form:form action="processForm" modelAttribute="customer">
    First Name (*): <form:input path="firstName" />
    <form:errors path="firstName" cssClass="error" />

    <br><br>
    Last Name: <form:input path="lastName" />

    <br><br>
    Zip Code: <form:input path="zipCode" />
    <form:errors path="zipCode" cssClass="error" />

    <br><br>
    Passes (Min 0, Max 10): <form:input path="passes" />
    <form:errors path="passes" cssClass="error" />


    <br><br>
    Course Code: <form:input path="courseCode" />
    <form:errors path="courseCode" cssClass="error" />

    <br><br>
    <input type="submit" value="Submit">
</form:form>
</body>
</html>
