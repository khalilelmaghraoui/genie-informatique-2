package com.tp1.appServlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "JeuServlet")
public class JeuServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public JeuServlet() {
    }
    public void null_Value(HttpServletRequest request) {
        HttpSession session = request.getSession();
        session.setAttribute("1", null);
        session.setAttribute("2", null);
        session.setAttribute("3", null);
        session.setAttribute("result", null);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();

        String Number = request.getParameter("Number__de");
        int result=-2;
        if(session.getAttribute(Number)==null) {
            int v = (int) (Math.random()*6) +1;
            session.setAttribute(Number,v);
            if((Number.equals("1") && v==6) || (Number.equals("2") && v==6))
            {
                result=0;
                null_Value(request);
                session.setAttribute("result",result);
                response.sendRedirect(request.getContextPath()+"/Result");
            }
            else {
                Object v1=session.getAttribute("1");
                Object v2=session.getAttribute("2");
                Object v3=session.getAttribute("3");

                if(Number.equals("1") && (( v2!=null && v>=(int)v2)||( v3!=null && v>=(int)v3))) {
                    result=0;
                    null_Value(request);
                    session.setAttribute("result",result);
                    response.sendRedirect(request.getContextPath()+"/Result");

                }
                else if(Number.equals("2") &&(( v1!=null && v<=(int)v1)||( v3!=null && v>=(int)v3))) {
                    result=0;
                    null_Value(request);
                    session.setAttribute("result",result);
                    response.sendRedirect(request.getContextPath()+"/Result");
                }
                else if(Number.equals("3") && (( v1!=null && v<=(int)v1)||( v2!=null && v<=(int)v2))) {
                    result=0;
                    null_Value(request);
                    session.setAttribute("result",result);
                    response.sendRedirect(request.getContextPath()+"/Result");
                }
                else {
                    if(result==-2 && v1!=null && v2!=null && v3!=null) {
                        result=(int)v1+(int)v2+(int)v3;
                        null_Value(request);
                        session.setAttribute("result",result);
                        response.sendRedirect(request.getContextPath()+"/Result");
                    }
                    else {
                        session.setAttribute(Number, v);
                        //request.setAttribute("xx", v);
                        request.getRequestDispatcher("jeu.jsp").forward(request, response);
                    }
                }
            }
        }
        else{
            result=-1;
            null_Value(request);
            session.setAttribute("result",result);
            response.sendRedirect(request.getContextPath()+"/Result");
        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        null_Value(request);
        request.getRequestDispatcher("jeu.jsp").forward(request, response);



    }
}
