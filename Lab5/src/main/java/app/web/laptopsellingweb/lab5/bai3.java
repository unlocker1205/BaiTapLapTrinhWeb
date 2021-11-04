package app.web.laptopsellingweb.lab5;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "bai3", value = "/bai3")
public class bai3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("username");
        String pass = request.getParameter("password");

        if (user.equals("admin") && pass.equals("admin")){
            response.getWriter().println("User: " + user + "\n" + "Password: " + pass);
        } else {
            response.getWriter().println("Login Failed!");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
