package app.web.laptopsellingweb.lab5;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "bai4-1", value = "/bai4-1")
public class bai41 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    public boolean getPhone(String input) {
        char[] chr = input.toCharArray();
        boolean result = false;
        if (chr.length != 10) {
            return false;
        }
        for (int i = 0; i < chr.length; i++) {
            if (chr[0] != 48) {
                result = false;
                break;
            } else {
                if (48 <= chr[i] && chr[i] <= 57) {
                    result = true;
                }
            }
        }
        return result;
    }

    public boolean checkMail(String input) {
        char[] arr = input.toCharArray();
        for (char x : arr
        ) {
            if (x == 64)
                return true;
        }
        return false;
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        String option = request.getParameter("option");
        String message = request.getParameter("message");


        response.getWriter().println("Full name: " + name);
        if (!getPhone(phone))
            response.getWriter().println("Khong phai so dien thoai!");
        else
            response.getWriter().println(phone);
        if (!checkMail(email))
            response.getWriter().println("Khong phai email!");
        else
            response.getWriter().println(email);
        response.getWriter().println("Option: " + option);
        response.getWriter().println("Message: " + message);

    }
}
