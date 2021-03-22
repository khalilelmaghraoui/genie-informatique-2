package com.tp_1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Multip")
public class Multip extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<center>");
		out.println("table de multiplication<br/>");
		out.println("<table width='60%' border=1>");
		out.println("<tr><td bgcolor='#FFff00' align='center'><strong>X</strong></td>");
		for (int i = 1; i <=10; i++) {
			out.println("<td align='center' bgcolor='#D1D7D6'>"+i+"</td>");
		}
		out.println("</tr>");
		for (int i = 1; i <=10; i++) {
			out.println("<tr>");
			out.println("<td align='center' bgcolor='#D1D7D6'>"+i+"</td>");
			for (int j = 1; j <=10; j++) {
				out.println("<td align='center'>"+i*j+"</td>");	
			}
			out.println("</tr>");
		}
		
		out.println("</table>");
		out.println("</center>");
	}

}
