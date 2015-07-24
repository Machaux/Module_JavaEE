package com.bankonet.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CompteEpargneServlet
 */
public class CompteEpargneServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession(false);
		
		if (session != null)
		{
			response.sendRedirect(request.getContextPath()+"/compteEpargneListe.jsp");
		}
		else
		{
			response.sendRedirect(request.getContextPath()+"/login.jsp");
		}
	}

}
