<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML>

<html>
<head>
    <title>
        Customer Confirmation
    </title>
</head>
<body>
The customer is confirmed: ${customer.firstName} ${customer.lastName}

<br>
Zip Code: ${customer.zipCode}

<br>
Number of passes: ${customer.passes}

<br>
Course Code: ${customer.courseCode}

</body>
</html>
