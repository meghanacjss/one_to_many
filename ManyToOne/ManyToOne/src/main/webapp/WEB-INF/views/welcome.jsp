<%@page language="java" %>
<html>
<head>
    <style>
        body {
            background-color: brown;
        }
        button {
            background-color: pink;
            color:white;
            padding: 10px 20px;
            margin: 5px;
            cursor: pointer;
        }
    </style>
</head>

<center>
<body >
    <button onclick="redirectTo('form')">Add course</button>

    <button onclick="redirectTo('list')">Get All Courses</button>

    <button onclick="redirectTo('delete')">Delete Course</button>

  <script>
        function redirectTo(url) {
            window.location.href = url;
        }
    </script>
</body>
</center>
