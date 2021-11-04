<%--
  Created by IntelliJ IDEA.
  User: Thinh PC
  Date: 11/4/2021
  Time: 3:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Bài 3</title>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta2/css/all.min.css" integrity="sha512-YWzhKL2whUzgiheMoBFwW8CKV4qpHQAEuvilg9FAn5VJUDwKZZxkJNuGM4XkWuk94WCrrwslk8yWNGmY1EduTA==" crossorigin="anonymous" referrerpolicy="no-referrer" />
    <link rel="stylesheet" href="bai3.css">
</head>
<body>
<div id="main">
    <form action="/lab5/bai3" method="post" class="form">
        <h1 class="heading">Sign In</h1>
        <input type="text" required name="username" placeholder="username or email" class="user">
        <input type="password" required name="password" placeholder="password" class="pass">
        <button class="btn">SIGN IN</button>
        <p class="or-with">Or login with</p>
        <div class="icon">
            <a href="" class="icon-item"><i class="fab fa-facebook"></i></a>
            <a href="" class="icon-item"><i class="fab fa-google"></i></a>
        </div>
        <a href="" class="sign-up">Sign Up</a>
    </form>
</div>
</body>
</html>
