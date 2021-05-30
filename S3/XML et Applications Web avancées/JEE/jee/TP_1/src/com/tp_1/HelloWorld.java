package com.tp_1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/HelloWorld")
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String nom = request.getParameter("nom");
		String ville = request.getParameter("ville");
		out.println("bienvenue "+nom +" , ville : "+ville);
		
		out.println("<table border=4>");
		for(int i=1;i<=10;i++)
		{
			out.println("<tr>");
			for(int j=1;j<=10;j++) {
				out.println("<td align='center'>");
				out.println("M("+i+","+j+")");
				out.println("</td>");
			}
			out.println("</tr>");
		}
		out.println("</table>");
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String nom = request.getParameter("nom");
		String ville = request.getParameter("ville");
		String sexe = request.getParameter("sexe");
		out.println("METHODE POST !!! <br/>");
		out.println("bienvenue "+nom +" , ville : "+ville+" , sexe : "+sexe);
	}

}
