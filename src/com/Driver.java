package com;

import java.io.File;
//import java.io.FileInputStream;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Driver
{
	public static void main(String[] args) throws Exception 
	{
		Connection myConn = null;
		PreparedStatement myStmt = null;
		FileReader input = null;
		
		try 
		{
			String url = "jdbc:mysql://localhost:3306/nlpprojschema";
			String username = "root";
			String password = "Gribbit2310$";
			myConn = DriverManager.getConnection(url, username, password);

			String sql = "update document set news_document = ? where id = 28";
			myStmt = myConn.prepareStatement(sql);
			
			File theFile = new File("142news.txt");
			input = new FileReader(theFile);
			myStmt.setCharacterStream(1, input);
			
			//System.out.println("Reading input file: " + theFile.getAbsolutePath());
			
			myStmt.executeUpdate();
			
			System.out.println("\nCompleted successfully!");
			
		} 
		catch (Exception exc) 
		{
			exc.printStackTrace();
		} 
		finally 
		{			
			if (input != null) 
			{
				input.close();
			}
			
			close(myConn, myStmt);			
		}
	}

	private static void close(Connection myConn, Statement myStmt) throws SQLException 
	{

		if (myStmt != null) 
		{
			myStmt.close();
		}
		
		if (myConn != null) 
		{
			myConn.close();
		}
	}

}
