package com.nlpproj.servlet14;

import java.io.File;
import java.io.IOException;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nlpproj.facade.Proj_facade;

@WebServlet("/News14tuples_servlet")
public class News14tuples_servlet extends HttpServlet 
{
	
private RequestDispatcher artJsp;
	
	public void init(ServletConfig config) throws ServletException 
	{
		ServletContext context = config.getServletContext();
		artJsp = context.getRequestDispatcher("/WEB-INF/jsp/article15.jsp");
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		Proj_facade facade = new Proj_facade();
		//ResultSet records = null;
		List<String[]> records = new ArrayList<String[]>();
		File news_doc = null;
		//String action = request.getParameter("action");
		try 
		{
			records = facade.getDataForQuery15();
			news_doc = facade.getDocForQuery15();
		} 
		catch (SQLException | ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

		
		request.setAttribute("records", records);
		request.setAttribute("doc", news_doc);
		//request.setAttribute("query",action);
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
				facade.postDataForQuery14(filtered_tuples);
			doGet(request, response);
		}
		catch (SQLException | ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
	}
}
