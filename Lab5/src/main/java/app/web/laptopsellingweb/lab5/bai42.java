package app.web.laptopsellingweb.lab5;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "bai4-2", value = "/bai4-2")
public class bai42 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
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

    public boolean checkNumer(String input) {
        char[] chr = input.toCharArray();
        for (int i = 0; i < chr.length; i++) {
            if (48 <= chr[i] && chr[i] <= 57) {
                return true;
            }
        }
        return false;
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String pass = request.getParameter("password");
        String day = request.getParameter("day");
        String month = request.getParameter("month");
        String year = request.getParameter("year");
        String male = request.getParameter("male");
        String female = request.getParameter("female");
        String creditCard = request.getHeader("credit-card");
        String paypal = request.getParameter("paypal");
        String cardNumber = request.getParameter("card-number");
        String cardCVC = request.getParameter("card-cvc");
        String dayMonth = request.getParameter("day-month");
        String yearOption = request.getParameter("year-option");

        response.getWriter().println("Full name: " + name);
        if (!checkMail(email)) {
            response.getWriter().println("Email error!");
        } else {
            response.getWriter().println("Email: " + email);
        }
        response.getWriter().println("Pass: " + pass);
        if (!checkNumer(day) && !checkNumer(month) && !checkNumer(year))
            response.getWriter().println("Date: null/null/null");
        else
            response.getWriter().println("Date: " + day + "/" + month + "/" + year);
        response.getWriter().println("Sex: " + male + " or " + female);
        response.getWriter().println("Credit card: " + creditCard);
        response.getWriter().println("Paypal: " + paypal);
        response.getWriter().println("Card number: " + cardNumber);
        response.getWriter().println("Card CVC: " + cardCVC);
        response.getWriter().println("Date: " + dayMonth + " " + yearOption);
    }
}
