<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%
    request.setCharacterEncoding("UTF-8");
    response.setCharacterEncoding("UTF-8");
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta content="IE=edge" http-equiv="X-UA-Compatible">
    <meta content="width=device-width, initial-scale=1.0" name="viewport">
    <title>Laptops selling website</title>
    <link href="css/style.css" rel="stylesheet">
    <link href="fonts/themify-icons/themify-icons.css" rel="stylesheet">
    <link href="fonts/font-awesome-4.7.0/css/font-awesome.css" rel="stylesheet">
    <link href="fonts/font-awesome-4.7.0/css/font-awesome.min.css" rel="stylesheet">
    <link crossorigin="anonymous" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta2/css/all.min.css"
          integrity="sha512-YWzhKL2whUzgiheMoBFwW8CKV4qpHQAEuvilg9FAn5VJUDwKZZxkJNuGM4XkWuk94WCrrwslk8yWNGmY1EduTA=="
          referrerpolicy="no-referrer" rel="stylesheet"/>
    <!--    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/slick-carousel/1.8.1/slick-theme.min.css" integrity="sha512-17EgCFERpgZKcm0j0fEq1YCJuyAWdz9KUtv1EjVuaOz8pDnh/0nZxmU6BBXwaaxqoi9PQXnRWqlcDB027hgv9A==" crossorigin="anonymous" referrerpolicy="no-referrer" />-->
    <link crossorigin="anonymous" href="https://cdnjs.cloudflare.com/ajax/libs/slick-carousel/1.8.1/slick.min.css"
          integrity="sha512-yHknP1/AwR+yx26cB1y0cjvQUMvEa2PFzt1c9LlS4pRQ5NOTZFWbhBig+X9G9eYW/8m0/4OXNx8pxJ6z57x0dw=="
          referrerpolicy="no-referrer" rel="stylesheet"/>
</head>
<body>
<div id="main">
    <div id="header">
        <a href="#">
            <div class="header_logo">
                <img alt="" class="logo" src="image/img_1.png">
            </div>
        </a>
        <form action="" class="header_search">
            <div class="search">
                <input class="header_input-search" placeholder="Nhập từ khóa cần tìm kiếm" required type="text">
                <button class="header_btn-search" role="button">
                    <i class="fas fa-search"></i>
                </button>
            </div>
        </form>
        <div class="header_list">
            <ul class="header_list-item">
                <li class="header_sub-list">
                    <a class="font-14 hover-header" href="product-page.html">
                        <i class="hover-header1 fas fa-percent"></i>Sản phẩm
                    </a>
                </li>
                <li class="header_sub-list">
                    <a class="font-14 hover-header" href="tutorial-page.html">
                        <i class="hover-header1 fas fa-clipboard-check"></i>Hướng dẫn
                    </a>
                </li>
                <li class="header_sub-list">
                    <a class="font-14 hover-header" href="about-us.html">
                        <i class="hover-header1 fas fa-users"></i>Thông tin
                    </a>
                </li>
                <li class="header_sub-list">
                    <a class="font-14 hover-header" href="Cart.html">
                        <i class="hover-header1 fas fa-shopping-cart"></i>Giỏ hàng
                    </a>
                </li>
                <li class="header_sub-list">
                    <a class="font-14 hover-header js-btn-login" role="button">
                        <i class="hover-header1 fas fa-user"></i>Đăng nhập
                    </a>
                </li>
            </ul>
        </div>
    </div>
    <div id="slider">
        <jsp:useBean id="imageSlider" scope="request" type="java.util.List"/>
        <c:forEach var="i" items="${imageSlider}">
            <div class="slider-image" style="background-image: url(${i})"></div>
        </c:forEach>
        <button class="btn-slider previous"><i class="fas fa-chevron-left"></i></button>
        <button class="btn-slider  next"><i class="fas fa-chevron-right"></i></button>
        <div class="slider-element">
            <jsp:useBean id="imageCarousel" scope="request" type="java.util.List"/>
            <c:forEach var="i" items="${imageCarousel}">
                <div class="slider-items" style="background-image: url(${i})"></div>
            </c:forEach>
        </div>
    </div>
    <div id="content">
        <div class="outstanding-brand">
            <div class="outstading-brand-main">
                <div class="title-outstanding">
                    <div class="border-outstanding"></div>
                    <div class="title-main">Thương hiệu nổi bật</div>
                </div>
                <div class="outstand-product">
                    <jsp:useBean id="imgOutstandingBrand" scope="request" type="java.util.List"/>
                    <c:forEach var="i" items="${imgOutstandingBrand}">
                        <div class="outstand-product-items">
                            <a class="click-css" href="">
                                <div class="img-outstand" style="background-image: url(${i.image})">
                                </div>
                            </a>
                            <div class="title-outstand">${i.outstanding}</div>
                        </div>
                    </c:forEach>
                </div>
            </div>
        </div>
        <div class="product">
            <div class="product-biggest">
                <jsp:useBean id="groupProduct" scope="request" type="java.util.List"/>
                <c:forEach var="i" items="${groupProduct}">
                    <div class="product-item-big">
                        <div class="title-product">
                            <div class="border-product"></div>
                            <div class="title-main-product">${i.titleGr}</div>
                            <a class="view-all" href="">Xem tất cả <i class="fas fa-angle-right"></i></a>
                        </div>
                        <div class="product-cover">
                            <a class="product-hover-selling" href="">
                                <div class="product-selling" style="background-image: url(${i.poster})"></div>
                            </a>
                            <div class="product-item-cover">
                                <c:forEach var="x" items="${i.listItems}">
                                    <a class="product-hover-items" href="">
                                        <div class="product-items">
                                            <div class="title-product-item">
                                                <p>${x.titleItem}</p>
                                            </div>
                                            <div class="slogan-item">
                                                <p>${x.slogan}</p>
                                            </div>
                                            <div class="img-product-item" style="background-image: url(${x.image})">
                                            </div>
                                        </div>
                                    </a>
                                </c:forEach>
                            </div>
                        </div>
                    </div>
                </c:forEach>
            </div>
        </div>
        <div class="bestseller">
            <div class="bestseller-main">
                <div class="title-bestseller">
                    <div class="border-bestseller"></div>
                    <div class="title-main-bestseller">Bán chạy nhất</div>
                    <a class="view-all-bestseller" href="">Xem tất cả <i class="fas fa-angle-right"></i></a>
                </div>
                <div class="product-bestseller">
                    <jsp:useBean id="products" scope="request" type="java.util.List"/>
                    <c:forEach var="i" items="${products}">
                        <a class="click-action" href="">
                            <div class="product-bestseller-items">
                                <div class="img-product-bestseller" style="background-image: url(${i.image})"></div>
                                <div class="product-bestseller-name">
                                    <div class="product-name">${i.name}</div>
                                    <div class="product-status">${i.description}</div>
                                </div>
                                <div class="product-price">${i.price} ₫</div>
                            </div>
                        </a>
                    </c:forEach>
                </div>
            </div>
        </div>
    </div>
    <div id="footer">
        <div class="footer-main">
            <div class="footer-element">
                <a class="footer-icon" href="https://github.com/unlocker1205/LaptopSellingWebsite" target="_blank"><i
                        class="fab fa-github"></i></a>
                <a class="footer-icon" href="" target="_blank"><i class="fas fa-globe-asia"></i></a>
                <a class="footer-icon" href="" target="_blank"><i class="fas fa-users"></i></a>
                <p class="copyright">Design by Team 1 © Web programming 2021</p>
            </div>
        </div>
    </div>
</div>
</body>
<script src="js/register.js"></script>
<script crossorigin="anonymous" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk="
        src="https://code.jquery.com/jquery-3.6.0.js"></script>
<script crossorigin="anonymous"
        integrity="sha512-XtmMtDEcNz2j7ekrtHvOVR4iwwaD6o/FUJe6+Zq+HgcCsk3kj4uSQQR8weQ2QVj1o0Pk6PwYLohm206ZzNfubg=="
        referrerpolicy="no-referrer"
        src="https://cdnjs.cloudflare.com/ajax/libs/slick-carousel/1.8.1/slick.min.js"></script>
<script src="js/slider.js"></script>
<script src="js/product-bestseller.js"></script>
</html>