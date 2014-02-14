<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Input form</title>
</head>
<body>
<form:form method="POST" commandName="form.jsp">
    <div>
        <label for="nameInput">Name: </label>
        <form:input path="name" id="nameInput" />
    </div>
</form:form>

</body>
</html>