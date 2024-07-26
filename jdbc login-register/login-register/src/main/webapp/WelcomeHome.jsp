<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Homepage</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f8f9fa;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
            text-align: center;
        }
        .container {
            background-color: #ffffff;
            padding: 20px;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            max-width: 400px;
            width: 100%;
        }
        h1 {
            margin-top: 0;
            margin-bottom: 20px;
        }
        a {
            display: inline-block;
            padding: 10px 20px;
            margin-top: 15px;
            text-decoration: none;
            color: white;
            background-color: #007bff;
            border-radius: 4px;
            cursor: pointer;
        }
        a:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>

    <div class="container">
        <h1>Welcome <%= session.getAttribute("username") %> to the homepage</h1>
        <a href="Login.jsp">Logout</a>
    </div>
     
     
     
</body>
</html>
