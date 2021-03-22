package com.tp_1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Navigation")
public class Navigation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Navigation() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String nom = request.getParameter("nom");
		HttpSession session = request.getSession();
		ServletContext context = request.getServletContext();
		if(nom!="" && nom!=null) {
			session.setAttribute("valeur_nom", nom);
			context.setAttribute("context_value", nom);
		}
		out.println(nom+"<br/>");
		out.println(session.getAttribute("valeur_nom")+"<br/>");
		out.println(context.getAttribute("context_value"));
		
			
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String nom = request.getParameter("nom");
		if (!nom.equals("")) {
			this.getServletContext().getRequestDispatcher("/formule3.html").forward(request, response);
		} else {
			this.getServletContext().getRequestDispatcher("/formule2.html").forward(request, response);
			//response.sendRedirect("https://www.google.com/");
		}
	}

}
