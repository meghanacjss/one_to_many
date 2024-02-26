<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Course Form</title>
</head>
<body>
    <h2>Course Form</h2>

    <form action="save" method="post">

        <label for="id">Course ID:</label>
        <input type="number" id="id" name="id" required>
        <br>

        <label for="name">Course Name:</label>
        <input type="text" id="name" name="name" required>
        <br>
        <input type="submit" value="Save">
    </form>
</body>
</html>



