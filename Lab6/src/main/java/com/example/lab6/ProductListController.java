package com.example.lab6;

import com.example.lab6.service.ProductService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ProductListController", value = "/ProductList")
public class ProductListController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("products", ProductService.getInstance().getAll());
        request.setAttribute("imageSlider", ProductService.getInstance().getAllImageSlide());
        request.setAttribute("groupProduct", ProductService.getInstance().getAllGroupProduct());
        request.setAttribute("imageCarousel", ProductService.getInstance().getAllImageCarousel());
        request.setAttribute("imgOutstandingBrand", ProductService.getInstance().getAllImageOutstandingBrand());
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
