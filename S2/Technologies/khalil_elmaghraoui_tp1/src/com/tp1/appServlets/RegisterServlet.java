package com.tp1.appServlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "RegisterServlet")

public class RegisterServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    public RegisterServlet() {
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       doGet(request,response);


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

          String email = request.getParameter("email");
          String password = request.getParameter("password");
          String username = request.getParameter("username");



         response.addCookie(new Cookie("email",email));
         response.addCookie(new Cookie("password",password));
         response.addCookie(new Cookie("username",username));

        this.getServletContext().getRequestDispatcher("/register.jsp").forward(request, response);
    }








    }

