package com.nlpproj.servlet23;

import java.io.IOException;


import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nlpproj.facade.Proj_facade;

@WebServlet("/News23tuples_servlet")
public class News23tuples_servlet extends HttpServlet 
{
	
private RequestDispatcher artJsp;
	
	public void init(ServletConfig config) throws ServletException 
	{
		ServletContext context = config.getServletContext();
		artJsp = context.getRequestDispatcher("/WEB-INF/jsp/article24.jsp");
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		artJsp.forward(request,response);
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String[] filtered_tuples = request.getParameterValues("news_tuple");
		Proj_facade facade = new Proj_facade();
		int flag = 0;
		if(filtered_tuples[0].equals("None") && filtered_tuples.length==1)
		{
				flag = 1;
		}
				
		try
		{
			if(flag==0)
				facade.postDataForQuery23(filtered_tuples);
			doGet(request, response);
		}
		catch (SQLException | ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
	}
}
