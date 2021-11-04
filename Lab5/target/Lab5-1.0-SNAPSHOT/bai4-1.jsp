<%--
  Created by IntelliJ IDEA.
  User: Thinh PC
  Date: 11/4/2021
  Time: 3:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Bai 4-1</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta2/css/all.min.css" integrity="sha512-YWzhKL2whUzgiheMoBFwW8CKV4qpHQAEuvilg9FAn5VJUDwKZZxkJNuGM4XkWuk94WCrrwslk8yWNGmY1EduTA==" crossorigin="anonymous" referrerpolicy="no-referrer" />
    <meta charset="UTF-8">
    <link href="bai4-1.css" rel="stylesheet">
</head>
<body>
<div id="main">
    <form action="/lab5/bai4-1" class="form" method="post">
        <h1 class="heading">Contact Us</h1>
        <div class="full-name max-width">
            <p class="title-name">FULL NAME &#42</p>
            <input required class="enter-name max-width" name="name" placeholder="Enter Your Name" type="text">
        </div>
        <div class="email-phone max-width">
            <div class="email half-width">
                <p class="title-email">EMAIL &#42</p>
                <input required class="enter-email max-width" name="email" placeholder="Enter Your Email" type="text">
            </div>
            <div class="phone half-width">
                <p class="title-phone">PHONE</p>
                <input  required  class="enter-phone max-width" name="phone" placeholder="Enter Number Phone" type="text">
            </div>
        </div>
        <div class="full-name max-width">
            <p class="title-name">NEEDED SERVICES &#42</p>
            <!--            <input required  class="enter-name max-width" placeholder="Enter Your Name" type="text">-->
            <select name="option" id="select" required  class="enter-name max-width font">
                <option>Please chooses</option>
                <option>Option one</option>
            </select>
        </div>
        <div class="full-name max-width bg-white border">
            <p class="title-name bg-white">MESSAGE</p>
            <textarea name="message" id="" rows="10" placeholder="Enter your massage" class="text"></textarea>
        </div>
        <button class="btn max-width">Submit <i class="fas fa-arrow-right"></i></button>
    </form>
</div>
</body>
</html>
