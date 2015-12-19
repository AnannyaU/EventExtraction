package com.nlpproj.servlet;

import java.io.IOException;



import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;

public class Home_servlet extends HttpServlet 
{
	private RequestDispatcher homeJsp;

	@Override
	public void init(ServletConfig config) throws ServletException 
	{
		ServletContext context = config.getServletContext();
		homeJsp = context.getRequestDispatcher("/WEB-INF/jsp/home.jsp");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		req.setAttribute("message", "Click on the button below to redirect you to the next page.");
		homeJsp.forward(req, resp);
	}

	
}
