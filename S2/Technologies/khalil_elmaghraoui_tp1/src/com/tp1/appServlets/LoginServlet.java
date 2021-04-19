package com.tp1.appServlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String username = (String)request.getParameter("username");
        String password = (String)request.getParameter("password");

        request.setAttribute("message", null);

        //get the cookies

        Cookie[] user = request.getCookies();
        String CookiesUsername = (String)user[0].getValue();
        String CookiesPassword = (String)user[1].getValue();

        if((username != null && password != null)) {
            if(username.equals(CookiesUsername) && password.equals(CookiesPassword)){
                String urlCible = "/jeu";
                RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(urlCible);
                dispatcher.forward(request, response);
            }else{
                request.setAttribute("message", "username or password incorrect");
                this.getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);
            }
        }else {
            request.setAttribute("error ", "register first");
            request.getRequestDispatcher("register.jsp").forward(request, response);
        }

    }
}
