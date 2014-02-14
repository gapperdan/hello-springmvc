<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Input form</title>
</head>
<body>
<form:form method="POST" commandName="person" action="result">
    <div>
        <label for="nameInput">Name: </label>
        <form:input path="name" id="nameInput" />
        <br />
        <label for="emailInput">Email: </label>
        <form:input path="email" id="emailInput" />
    </div>
    <div>
        <input type="submit" value="Submit" />
    </div>
</form:form>

</body>
</html>