package com.nlpproj.dbconn;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;


public class Dbconn 
{
	public Connection createConnection() throws ClassNotFoundException
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection myConn = null;
		
		try 
		{
			String url = "jdbc:mysql://localhost:3306/nlpprojschema";
			String username = "root";
			String password = "Gribbit2310$";
			myConn = DriverManager.getConnection(url, username, password);
		            
		    if (myConn != null) 
		    {
		    	System.out.println("Connected to database");
		    }
		    else
		    {
		       	System.out.println("Connection is null");
		    }
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		} 
		return myConn;
	}

}
