package com.nlpproj.servlet;

import java.io.IOException;



import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.io.File;



import com.nlpproj.facade.Proj_facade;

public class Proj_servlet extends HttpServlet
{
	private RequestDispatcher artJsp;

	@Override
	public void init(ServletConfig config) throws ServletException 
	{
		ServletContext context = config.getServletContext();
		artJsp = context.getRequestDispatcher("/WEB-INF/jsp/article1.jsp");
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
			records = facade.getDataForQuery1();
			news_doc = facade.getDocForQuery1();
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
}
