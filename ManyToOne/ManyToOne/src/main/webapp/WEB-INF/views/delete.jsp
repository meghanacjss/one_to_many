<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <title>Delete course</title>
</head>
<body>
    <h2><i>Delete course</i></h2>

    <form action="/deleteCourse">
        Enter course ID to delete: <input type="number" name="id" required>
        <input type="submit" value="Delete">
    </form>

</body>
</html>
