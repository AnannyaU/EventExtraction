package com.nlpproj.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;

//import com.nlpproj.dbconn.Dbconn;

public class Dao 
{
	public void postDataForQuery1(Connection conn, String[] filtered_tuples) throws SQLException
	{
		String query = "INSERT INTO nlpprojschema.unwanted_tuples (u_docId, u_arg1, u_rel, u_arg2) VALUES (1, ?, ?, ?);";
		PreparedStatement prep = conn.prepareStatement(query);
		for( String s: filtered_tuples )
		{
			if(s.equals("None")==false)
			{
				int si = s.substring(1).indexOf("*");
				int li = s.lastIndexOf("*");
				String arg1 = s.substring(1, si+1);
				String rel = s.substring(si+2, li);
				String arg2 = s.substring(li+1);
				prep.setString(1, arg1);
				prep.setString(2, rel);
				prep.setString(3, arg2);
				prep.executeUpdate();
			}
		}
		if (prep != null) 
		{
			prep.close();
		}
		
	}
	
	public void postDataForQuery2(Connection conn, String[] filtered_tuples) throws SQLException
	{
		String query = "INSERT INTO nlpprojschema.unwanted_tuples (u_docId, u_arg1, u_rel, u_arg2) VALUES (2, ?, ?, ?);";
		PreparedStatement prep = conn.prepareStatement(query);
		for( String s: filtered_tuples )
		{
			if(s.equals("None")==false)
			{
				int si = s.substring(1).indexOf("*");
				int li = s.lastIndexOf("*");
				String arg1 = s.substring(1, si+1);
				String rel = s.substring(si+2, li);
				String arg2 = s.substring(li+1);
				prep.setString(1, arg1);
				prep.setString(2, rel);
				prep.setString(3, arg2);
				prep.executeUpdate();
			}
		}
		if (prep != null) 
		{
			prep.close();
		}
		
	}
	
	public void postDataForQuery3(Connection conn, String[] filtered_tuples) throws SQLException
	{
		String query = "INSERT INTO nlpprojschema.unwanted_tuples (u_docId, u_arg1, u_rel, u_arg2) VALUES (3, ?, ?, ?);";
		PreparedStatement prep = conn.prepareStatement(query);
		for( String s: filtered_tuples )
		{
			if(s.equals("None")==false)
			{
				int si = s.substring(1).indexOf("*");
				int li = s.lastIndexOf("*");
				String arg1 = s.substring(1, si+1);
				String rel = s.substring(si+2, li);
				String arg2 = s.substring(li+1);
				prep.setString(1, arg1);
				prep.setString(2, rel);
				prep.setString(3, arg2);
				prep.executeUpdate();
			}
		}
		if (prep != null) 
		{
			prep.close();
		}
		
	}
	
	public void postDataForQuery4(Connection conn, String[] filtered_tuples) throws SQLException
	{
		String query = "INSERT INTO nlpprojschema.unwanted_tuples (u_docId, u_arg1, u_rel, u_arg2) VALUES (4, ?, ?, ?);";
		PreparedStatement prep = conn.prepareStatement(query);
		for( String s: filtered_tuples )
		{
			if(s.equals("None")==false)
			{
				int si = s.substring(1).indexOf("*");
				int li = s.lastIndexOf("*");
				String arg1 = s.substring(1, si+1);
				String rel = s.substring(si+2, li);
				String arg2 = s.substring(li+1);
				prep.setString(1, arg1);
				prep.setString(2, rel);
				prep.setString(3, arg2);
				prep.executeUpdate();
			}
		}
		if (prep != null) 
		{
			prep.close();
		}
		
	}
	
	public void postDataForQuery5(Connection conn, String[] filtered_tuples) throws SQLException
	{
		String query = "INSERT INTO nlpprojschema.unwanted_tuples (u_docId, u_arg1, u_rel, u_arg2) VALUES (5, ?, ?, ?);";
		PreparedStatement prep = conn.prepareStatement(query);
		for( String s: filtered_tuples )
		{
			if(s.equals("None")==false)
			{
				int si = s.substring(1).indexOf("*");
				int li = s.lastIndexOf("*");
				String arg1 = s.substring(1, si+1);
				String rel = s.substring(si+2, li);
				String arg2 = s.substring(li+1);
				prep.setString(1, arg1);
				prep.setString(2, rel);
				prep.setString(3, arg2);
				prep.executeUpdate();
			}
		}
		if (prep != null) 
		{
			prep.close();
		}
		
	}
	
	public void postDataForQuery6(Connection conn, String[] filtered_tuples) throws SQLException
	{
		String query = "INSERT INTO nlpprojschema.unwanted_tuples (u_docId, u_arg1, u_rel, u_arg2) VALUES (6, ?, ?, ?);";
		PreparedStatement prep = conn.prepareStatement(query);
		for( String s: filtered_tuples )
		{
			if(s.equals("None")==false)
			{
				int si = s.substring(1).indexOf("*");
				int li = s.lastIndexOf("*");
				String arg1 = s.substring(1, si+1);
				String rel = s.substring(si+2, li);
				String arg2 = s.substring(li+1);
				prep.setString(1, arg1);
				prep.setString(2, rel);
				prep.setString(3, arg2);
				prep.executeUpdate();
			}
		}
		if (prep != null) 
		{
			prep.close();
		}
		
	}
	
	public void postDataForQuery7(Connection conn, String[] filtered_tuples) throws SQLException
	{
		String query = "INSERT INTO nlpprojschema.unwanted_tuples (u_docId, u_arg1, u_rel, u_arg2) VALUES (7, ?, ?, ?);";
		PreparedStatement prep = conn.prepareStatement(query);
		for( String s: filtered_tuples )
		{
			if(s.equals("None")==false)
			{
				int si = s.substring(1).indexOf("*");
				int li = s.lastIndexOf("*");
				String arg1 = s.substring(1, si+1);
				String rel = s.substring(si+2, li);
				String arg2 = s.substring(li+1);
				prep.setString(1, arg1);
				prep.setString(2, rel);
				prep.setString(3, arg2);
				prep.executeUpdate();
			}
		}
		if (prep != null) 
		{
			prep.close();
		}
		
	}
	
	public void postDataForQuery8(Connection conn, String[] filtered_tuples) throws SQLException
	{
		String query = "INSERT INTO nlpprojschema.unwanted_tuples (u_docId, u_arg1, u_rel, u_arg2) VALUES (8, ?, ?, ?);";
		PreparedStatement prep = conn.prepareStatement(query);
		for( String s: filtered_tuples )
		{
			if(s.equals("None")==false)
			{
				int si = s.substring(1).indexOf("*");
				int li = s.lastIndexOf("*");
				String arg1 = s.substring(1, si+1);
				String rel = s.substring(si+2, li);
				String arg2 = s.substring(li+1);
				prep.setString(1, arg1);
				prep.setString(2, rel);
				prep.setString(3, arg2);
				prep.executeUpdate();
			}
		}
		if (prep != null) 
		{
			prep.close();
		}
		
	}
	
	public void postDataForQuery9(Connection conn, String[] filtered_tuples) throws SQLException
	{
		String query = "INSERT INTO nlpprojschema.unwanted_tuples (u_docId, u_arg1, u_rel, u_arg2) VALUES (9, ?, ?, ?);";
		PreparedStatement prep = conn.prepareStatement(query);
		for( String s: filtered_tuples )
		{
			if(s.equals("None")==false)
			{
				int si = s.substring(1).indexOf("*");
				int li = s.lastIndexOf("*");
				String arg1 = s.substring(1, si+1);
				String rel = s.substring(si+2, li);
				String arg2 = s.substring(li+1);
				prep.setString(1, arg1);
				prep.setString(2, rel);
				prep.setString(3, arg2);
				prep.executeUpdate();
			}
		}
		if (prep != null) 
		{
			prep.close();
		}
		
	}
	
	public void postDataForQuery10(Connection conn, String[] filtered_tuples) throws SQLException
	{
		String query = "INSERT INTO nlpprojschema.unwanted_tuples (u_docId, u_arg1, u_rel, u_arg2) VALUES (10, ?, ?, ?);";
		PreparedStatement prep = conn.prepareStatement(query);
		for( String s: filtered_tuples )
		{
			if(s.equals("None")==false)
			{
				int si = s.substring(1).indexOf("*");
				int li = s.lastIndexOf("*");
				String arg1 = s.substring(1, si+1);
				String rel = s.substring(si+2, li);
				String arg2 = s.substring(li+1);
				prep.setString(1, arg1);
				prep.setString(2, rel);
				prep.setString(3, arg2);
				prep.executeUpdate();
			}
		}
		if (prep != null) 
		{
			prep.close();
		}
		
	}
	
	public void postDataForQuery11(Connection conn, String[] filtered_tuples) throws SQLException
	{
		String query = "INSERT INTO nlpprojschema.unwanted_tuples (u_docId, u_arg1, u_rel, u_arg2) VALUES (11, ?, ?, ?);";
		PreparedStatement prep = conn.prepareStatement(query);
		for( String s: filtered_tuples )
		{
			if(s.equals("None")==false)
			{
				int si = s.substring(1).indexOf("*");
				int li = s.lastIndexOf("*");
				String arg1 = s.substring(1, si+1);
				String rel = s.substring(si+2, li);
				String arg2 = s.substring(li+1);
				prep.setString(1, arg1);
				prep.setString(2, rel);
				prep.setString(3, arg2);
				prep.executeUpdate();
			}
		}
		if (prep != null) 
		{
			prep.close();
		}
		
	}
	
	public void postDataForQuery12(Connection conn, String[] filtered_tuples) throws SQLException
	{
		String query = "INSERT INTO nlpprojschema.unwanted_tuples (u_docId, u_arg1, u_rel, u_arg2) VALUES (12, ?, ?, ?);";
		PreparedStatement prep = conn.prepareStatement(query);
		for( String s: filtered_tuples )
		{
			if(s.equals("None")==false)
			{
				int si = s.substring(1).indexOf("*");
				int li = s.lastIndexOf("*");
				String arg1 = s.substring(1, si+1);
				String rel = s.substring(si+2, li);
				String arg2 = s.substring(li+1);
				prep.setString(1, arg1);
				prep.setString(2, rel);
				prep.setString(3, arg2);
				prep.executeUpdate();
			}
		}
		if (prep != null) 
		{
			prep.close();
		}
		
	}
	
	public void postDataForQuery13(Connection conn, String[] filtered_tuples) throws SQLException
	{
		String query = "INSERT INTO nlpprojschema.unwanted_tuples (u_docId, u_arg1, u_rel, u_arg2) VALUES (13, ?, ?, ?);";
		PreparedStatement prep = conn.prepareStatement(query);
		for( String s: filtered_tuples )
		{
			if(s.equals("None")==false)
			{
				int si = s.substring(1).indexOf("*");
				int li = s.lastIndexOf("*");
				String arg1 = s.substring(1, si+1);
				String rel = s.substring(si+2, li);
				String arg2 = s.substring(li+1);
				prep.setString(1, arg1);
				prep.setString(2, rel);
				prep.setString(3, arg2);
				prep.executeUpdate();
			}
		}
		if (prep != null) 
		{
			prep.close();
		}
		
	}
	
	public void postDataForQuery14(Connection conn, String[] filtered_tuples) throws SQLException
	{
		String query = "INSERT INTO nlpprojschema.unwanted_tuples (u_docId, u_arg1, u_rel, u_arg2) VALUES (14, ?, ?, ?);";
		PreparedStatement prep = conn.prepareStatement(query);
		for( String s: filtered_tuples )
		{
			if(s.equals("None")==false)
			{
				int si = s.substring(1).indexOf("*");
				int li = s.lastIndexOf("*");
				String arg1 = s.substring(1, si+1);
				String rel = s.substring(si+2, li);
				String arg2 = s.substring(li+1);
				prep.setString(1, arg1);
				prep.setString(2, rel);
				prep.setString(3, arg2);
				prep.executeUpdate();
			}
		}
		if (prep != null) 
		{
			prep.close();
		}
		
	}
	
	public void postDataForQuery15(Connection conn, String[] filtered_tuples) throws SQLException
	{
		String query = "INSERT INTO nlpprojschema.unwanted_tuples (u_docId, u_arg1, u_rel, u_arg2) VALUES (15, ?, ?, ?);";
		PreparedStatement prep = conn.prepareStatement(query);
		for( String s: filtered_tuples )
		{
			if(s.equals("None")==false)
			{
				int si = s.substring(1).indexOf("*");
				int li = s.lastIndexOf("*");
				String arg1 = s.substring(1, si+1);
				String rel = s.substring(si+2, li);
				String arg2 = s.substring(li+1);
				prep.setString(1, arg1);
				prep.setString(2, rel);
				prep.setString(3, arg2);
				prep.executeUpdate();
			}
		}
		if (prep != null) 
		{
			prep.close();
		}
		
	}
	
	public void postDataForQuery16(Connection conn, String[] filtered_tuples) throws SQLException
	{
		String query = "INSERT INTO nlpprojschema.unwanted_tuples (u_docId, u_arg1, u_rel, u_arg2) VALUES (16, ?, ?, ?);";
		PreparedStatement prep = conn.prepareStatement(query);
		for( String s: filtered_tuples )
		{
			if(s.equals("None")==false)
			{
				int si = s.substring(1).indexOf("*");
				int li = s.lastIndexOf("*");
				String arg1 = s.substring(1, si+1);
				String rel = s.substring(si+2, li);
				String arg2 = s.substring(li+1);
				prep.setString(1, arg1);
				prep.setString(2, rel);
				prep.setString(3, arg2);
				prep.executeUpdate();
			}
		}
		if (prep != null) 
		{
			prep.close();
		}
		
	}
	
	public void postDataForQuery17(Connection conn, String[] filtered_tuples) throws SQLException
	{
		String query = "INSERT INTO nlpprojschema.unwanted_tuples (u_docId, u_arg1, u_rel, u_arg2) VALUES (17, ?, ?, ?);";
		PreparedStatement prep = conn.prepareStatement(query);
		for( String s: filtered_tuples )
		{
			if(s.equals("None")==false)
			{
				int si = s.substring(1).indexOf("*");
				int li = s.lastIndexOf("*");
				String arg1 = s.substring(1, si+1);
				String rel = s.substring(si+2, li);
				String arg2 = s.substring(li+1);
				prep.setString(1, arg1);
				prep.setString(2, rel);
				prep.setString(3, arg2);
				prep.executeUpdate();
			}
		}
		if (prep != null) 
		{
			prep.close();
		}
		
	}
	
	public void postDataForQuery18(Connection conn, String[] filtered_tuples) throws SQLException
	{
		String query = "INSERT INTO nlpprojschema.unwanted_tuples (u_docId, u_arg1, u_rel, u_arg2) VALUES (18, ?, ?, ?);";
		PreparedStatement prep = conn.prepareStatement(query);
		for( String s: filtered_tuples )
		{
			if(s.equals("None")==false)
			{
				int si = s.substring(1).indexOf("*");
				int li = s.lastIndexOf("*");
				String arg1 = s.substring(1, si+1);
				String rel = s.substring(si+2, li);
				String arg2 = s.substring(li+1);
				prep.setString(1, arg1);
				prep.setString(2, rel);
				prep.setString(3, arg2);
				prep.executeUpdate();
			}
		}
		if (prep != null) 
		{
			prep.close();
		}
		
	}
	
	public void postDataForQuery19(Connection conn, String[] filtered_tuples) throws SQLException
	{
		String query = "INSERT INTO nlpprojschema.unwanted_tuples (u_docId, u_arg1, u_rel, u_arg2) VALUES (19, ?, ?, ?);";
		PreparedStatement prep = conn.prepareStatement(query);
		for( String s: filtered_tuples )
		{
			if(s.equals("None")==false)
			{
				int si = s.substring(1).indexOf("*");
				int li = s.lastIndexOf("*");
				String arg1 = s.substring(1, si+1);
				String rel = s.substring(si+2, li);
				String arg2 = s.substring(li+1);
				prep.setString(1, arg1);
				prep.setString(2, rel);
				prep.setString(3, arg2);
				prep.executeUpdate();
			}
		}
		if (prep != null) 
		{
			prep.close();
		}
		
	}
	
	public void postDataForQuery20(Connection conn, String[] filtered_tuples) throws SQLException
	{
		String query = "INSERT INTO nlpprojschema.unwanted_tuples (u_docId, u_arg1, u_rel, u_arg2) VALUES (20, ?, ?, ?);";
		PreparedStatement prep = conn.prepareStatement(query);
		for( String s: filtered_tuples )
		{
			if(s.equals("None")==false)
			{
				int si = s.substring(1).indexOf("*");
				int li = s.lastIndexOf("*");
				String arg1 = s.substring(1, si+1);
				String rel = s.substring(si+2, li);
				String arg2 = s.substring(li+1);
				prep.setString(1, arg1);
				prep.setString(2, rel);
				prep.setString(3, arg2);
				prep.executeUpdate();
			}
		}
		if (prep != null) 
		{
			prep.close();
		}
		
	}
	
	public void postDataForQuery21(Connection conn, String[] filtered_tuples) throws SQLException
	{
		String query = "INSERT INTO nlpprojschema.unwanted_tuples (u_docId, u_arg1, u_rel, u_arg2) VALUES (21, ?, ?, ?);";
		PreparedStatement prep = conn.prepareStatement(query);
		for( String s: filtered_tuples )
		{
			if(s.equals("None")==false)
			{
				int si = s.substring(1).indexOf("*");
				int li = s.lastIndexOf("*");
				String arg1 = s.substring(1, si+1);
				String rel = s.substring(si+2, li);
				String arg2 = s.substring(li+1);
				prep.setString(1, arg1);
				prep.setString(2, rel);
				prep.setString(3, arg2);
				prep.executeUpdate();
			}
		}
		if (prep != null) 
		{
			prep.close();
		}
		
	}
	
	public void postDataForQuery22(Connection conn, String[] filtered_tuples) throws SQLException
	{
		String query = "INSERT INTO nlpprojschema.unwanted_tuples (u_docId, u_arg1, u_rel, u_arg2) VALUES (22, ?, ?, ?);";
		PreparedStatement prep = conn.prepareStatement(query);
		for( String s: filtered_tuples )
		{
			if(s.equals("None")==false)
			{
				int si = s.substring(1).indexOf("*");
				int li = s.lastIndexOf("*");
				String arg1 = s.substring(1, si+1);
				String rel = s.substring(si+2, li);
				String arg2 = s.substring(li+1);
				prep.setString(1, arg1);
				prep.setString(2, rel);
				prep.setString(3, arg2);
				prep.executeUpdate();
			}
		}
		if (prep != null) 
		{
			prep.close();
		}
		
	}
	
	public void postDataForQuery23(Connection conn, String[] filtered_tuples) throws SQLException
	{
		String query = "INSERT INTO nlpprojschema.unwanted_tuples (u_docId, u_arg1, u_rel, u_arg2) VALUES (28, ?, ?, ?);";
		PreparedStatement prep = conn.prepareStatement(query);
		for( String s: filtered_tuples )
		{
			if(s.equals("None")==false)
			{
				int si = s.substring(1).indexOf("*");
				int li = s.lastIndexOf("*");
				String arg1 = s.substring(1, si+1);
				String rel = s.substring(si+2, li);
				String arg2 = s.substring(li+1);
				prep.setString(1, arg1);
				prep.setString(2, rel);
				prep.setString(3, arg2);
				prep.executeUpdate();
			}
		}
		if (prep != null) 
		{
			prep.close();
		}
		
	}
	
	public ResultSet getDataForQuery1(Connection conn) throws SQLException, ClassNotFoundException 
	{
		ResultSet result;
		String query = "SELECT argument1, relation, argument2 FROM nlpprojschema.extracted_tuples WHERE doc_id = 1;";
		result = getData(conn,query);
		return result;
	}
	
	public ResultSet getDocForQuery1(Connection conn) throws SQLException, ClassNotFoundException 
	{
		ResultSet result;
		String query = "SELECT news_document FROM nlpprojschema.document WHERE id = 1;";
		result = getData(conn,query);
		return result;
	}
	
	public ResultSet getDataForQuery2(Connection conn) throws SQLException, ClassNotFoundException 
	{
		ResultSet result;
		String query = "SELECT argument1, relation, argument2 FROM nlpprojschema.extracted_tuples WHERE doc_id = 2;";
		result = getData(conn,query);
		return result;
	}
	
	public ResultSet getDocForQuery2(Connection conn) throws SQLException, ClassNotFoundException 
	{
		ResultSet result;
		String query = "SELECT news_document FROM nlpprojschema.document WHERE id = 2;";
		result = getData(conn,query);
		return result;
	}
	
	public ResultSet getDataForQuery3(Connection conn) throws SQLException, ClassNotFoundException 
	{
		ResultSet result;
		String query = "SELECT argument1, relation, argument2 FROM nlpprojschema.extracted_tuples WHERE doc_id = 3;";
		result = getData(conn,query);
		return result;
	}
	
	public ResultSet getDocForQuery3(Connection conn) throws SQLException, ClassNotFoundException 
	{
		ResultSet result;
		String query = "SELECT news_document FROM nlpprojschema.document WHERE id = 3;";
		result = getData(conn,query);
		return result;
	}
	
	public ResultSet getDataForQuery4(Connection conn) throws SQLException, ClassNotFoundException 
	{
		ResultSet result;
		String query = "SELECT argument1, relation, argument2 FROM nlpprojschema.extracted_tuples WHERE doc_id = 4;";
		result = getData(conn,query);
		return result;
	}
	
	public ResultSet getDocForQuery4(Connection conn) throws SQLException, ClassNotFoundException 
	{
		ResultSet result;
		String query = "SELECT news_document FROM nlpprojschema.document WHERE id = 4;";
		result = getData(conn,query);
		return result;
	}
	
	public ResultSet getDataForQuery5(Connection conn) throws SQLException, ClassNotFoundException 
	{
		ResultSet result;
		String query = "SELECT argument1, relation, argument2 FROM nlpprojschema.extracted_tuples WHERE doc_id = 5;";
		result = getData(conn,query);
		return result;
	}
	
	public ResultSet getDocForQuery5(Connection conn) throws SQLException, ClassNotFoundException 
	{
		ResultSet result;
		String query = "SELECT news_document FROM nlpprojschema.document WHERE id = 5;";
		result = getData(conn,query);
		return result;
	}
	
	public ResultSet getDataForQuery6(Connection conn) throws SQLException, ClassNotFoundException 
	{
		ResultSet result;
		String query = "SELECT argument1, relation, argument2 FROM nlpprojschema.extracted_tuples WHERE doc_id = 6;";
		result = getData(conn,query);
		return result;
	}
	
	public ResultSet getDocForQuery6(Connection conn) throws SQLException, ClassNotFoundException 
	{
		ResultSet result;
		String query = "SELECT news_document FROM nlpprojschema.document WHERE id = 6;";
		result = getData(conn,query);
		return result;
	}
	
	public ResultSet getDataForQuery7(Connection conn) throws SQLException, ClassNotFoundException 
	{
		ResultSet result;
		String query = "SELECT argument1, relation, argument2 FROM nlpprojschema.extracted_tuples WHERE doc_id = 7;";
		result = getData(conn,query);
		return result;
	}
	
	public ResultSet getDocForQuery7(Connection conn) throws SQLException, ClassNotFoundException 
	{
		ResultSet result;
		String query = "SELECT news_document FROM nlpprojschema.document WHERE id = 7;";
		result = getData(conn,query);
		return result;
	}
	
	public ResultSet getDataForQuery8(Connection conn) throws SQLException, ClassNotFoundException 
	{
		ResultSet result;
		String query = "SELECT argument1, relation, argument2 FROM nlpprojschema.extracted_tuples WHERE doc_id = 8;";
		result = getData(conn,query);
		return result;
	}
	
	public ResultSet getDocForQuery8(Connection conn) throws SQLException, ClassNotFoundException 
	{
		ResultSet result;
		String query = "SELECT news_document FROM nlpprojschema.document WHERE id = 8;";
		result = getData(conn,query);
		return result;
	}
	
	public ResultSet getDataForQuery9(Connection conn) throws SQLException, ClassNotFoundException 
	{
		ResultSet result;
		String query = "SELECT argument1, relation, argument2 FROM nlpprojschema.extracted_tuples WHERE doc_id = 9;";
		result = getData(conn,query);
		return result;
	}
	
	public ResultSet getDocForQuery9(Connection conn) throws SQLException, ClassNotFoundException 
	{
		ResultSet result;
		String query = "SELECT news_document FROM nlpprojschema.document WHERE id = 9;";
		result = getData(conn,query);
		return result;
	}
	
	public ResultSet getDataForQuery10(Connection conn) throws SQLException, ClassNotFoundException 
	{
		ResultSet result;
		String query = "SELECT argument1, relation, argument2 FROM nlpprojschema.extracted_tuples WHERE doc_id = 10;";
		result = getData(conn,query);
		return result;
	}
	
	public ResultSet getDocForQuery10(Connection conn) throws SQLException, ClassNotFoundException 
	{
		ResultSet result;
		String query = "SELECT news_document FROM nlpprojschema.document WHERE id = 10;";
		result = getData(conn,query);
		return result;
	}
	
	public ResultSet getDataForQuery11(Connection conn) throws SQLException, ClassNotFoundException 
	{
		ResultSet result;
		String query = "SELECT argument1, relation, argument2 FROM nlpprojschema.extracted_tuples WHERE doc_id = 11;";
		result = getData(conn,query);
		return result;
	}
	
	public ResultSet getDocForQuery11(Connection conn) throws SQLException, ClassNotFoundException 
	{
		ResultSet result;
		String query = "SELECT news_document FROM nlpprojschema.document WHERE id = 11;";
		result = getData(conn,query);
		return result;
	}
	
	public ResultSet getDataForQuery12(Connection conn) throws SQLException, ClassNotFoundException 
	{
		ResultSet result;
		String query = "SELECT argument1, relation, argument2 FROM nlpprojschema.extracted_tuples WHERE doc_id = 12;";
		result = getData(conn,query);
		return result;
	}
	
	public ResultSet getDocForQuery12(Connection conn) throws SQLException, ClassNotFoundException 
	{
		ResultSet result;
		String query = "SELECT news_document FROM nlpprojschema.document WHERE id = 12;";
		result = getData(conn,query);
		return result;
	}
	
	public ResultSet getDataForQuery13(Connection conn) throws SQLException, ClassNotFoundException 
	{
		ResultSet result;
		String query = "SELECT argument1, relation, argument2 FROM nlpprojschema.extracted_tuples WHERE doc_id = 13;";
		result = getData(conn,query);
		return result;
	}
	
	public ResultSet getDocForQuery13(Connection conn) throws SQLException, ClassNotFoundException 
	{
		ResultSet result;
		String query = "SELECT news_document FROM nlpprojschema.document WHERE id = 13;";
		result = getData(conn,query);
		return result;
	}
	
	public ResultSet getDataForQuery14(Connection conn) throws SQLException, ClassNotFoundException 
	{
		ResultSet result;
		String query = "SELECT argument1, relation, argument2 FROM nlpprojschema.extracted_tuples WHERE doc_id = 14;";
		result = getData(conn,query);
		return result;
	}
	
	public ResultSet getDocForQuery14(Connection conn) throws SQLException, ClassNotFoundException 
	{
		ResultSet result;
		String query = "SELECT news_document FROM nlpprojschema.document WHERE id = 14;";
		result = getData(conn,query);
		return result;
	}
	
	public ResultSet getDataForQuery15(Connection conn) throws SQLException, ClassNotFoundException 
	{
		ResultSet result;
		String query = "SELECT argument1, relation, argument2 FROM nlpprojschema.extracted_tuples WHERE doc_id = 15;";
		result = getData(conn,query);
		return result;
	}
	
	public ResultSet getDocForQuery15(Connection conn) throws SQLException, ClassNotFoundException 
	{
		ResultSet result;
		String query = "SELECT news_document FROM nlpprojschema.document WHERE id = 15;";
		result = getData(conn,query);
		return result;
	}
	
	public ResultSet getDataForQuery16(Connection conn) throws SQLException, ClassNotFoundException 
	{
		ResultSet result;
		String query = "SELECT argument1, relation, argument2 FROM nlpprojschema.extracted_tuples WHERE doc_id = 16;";
		result = getData(conn,query);
		return result;
	}
	
	public ResultSet getDocForQuery16(Connection conn) throws SQLException, ClassNotFoundException 
	{
		ResultSet result;
		String query = "SELECT news_document FROM nlpprojschema.document WHERE id = 16;";
		result = getData(conn,query);
		return result;
	}
	
	public ResultSet getDataForQuery17(Connection conn) throws SQLException, ClassNotFoundException 
	{
		ResultSet result;
		String query = "SELECT argument1, relation, argument2 FROM nlpprojschema.extracted_tuples WHERE doc_id = 17;";
		result = getData(conn,query);
		return result;
	}
	
	public ResultSet getDocForQuery17(Connection conn) throws SQLException, ClassNotFoundException 
	{
		ResultSet result;
		String query = "SELECT news_document FROM nlpprojschema.document WHERE id = 17;";
		result = getData(conn,query);
		return result;
	}
	
	public ResultSet getDataForQuery18(Connection conn) throws SQLException, ClassNotFoundException 
	{
		ResultSet result;
		String query = "SELECT argument1, relation, argument2 FROM nlpprojschema.extracted_tuples WHERE doc_id = 18;";
		result = getData(conn,query);
		return result;
	}
	
	public ResultSet getDocForQuery18(Connection conn) throws SQLException, ClassNotFoundException 
	{
		ResultSet result;
		String query = "SELECT news_document FROM nlpprojschema.document WHERE id = 18;";
		result = getData(conn,query);
		return result;
	}
	
	public ResultSet getDataForQuery19(Connection conn) throws SQLException, ClassNotFoundException 
	{
		ResultSet result;
		String query = "SELECT argument1, relation, argument2 FROM nlpprojschema.extracted_tuples WHERE doc_id = 19;";
		result = getData(conn,query);
		return result;
	}
	
	public ResultSet getDocForQuery19(Connection conn) throws SQLException, ClassNotFoundException 
	{
		ResultSet result;
		String query = "SELECT news_document FROM nlpprojschema.document WHERE id = 19;";
		result = getData(conn,query);
		return result;
	}
	
	public ResultSet getDataForQuery20(Connection conn) throws SQLException, ClassNotFoundException 
	{
		ResultSet result;
		String query = "SELECT argument1, relation, argument2 FROM nlpprojschema.extracted_tuples WHERE doc_id = 20;";
		result = getData(conn,query);
		return result;
	}
	
	public ResultSet getDocForQuery20(Connection conn) throws SQLException, ClassNotFoundException 
	{
		ResultSet result;
		String query = "SELECT news_document FROM nlpprojschema.document WHERE id = 20;";
		result = getData(conn,query);
		return result;
	}
	
	public ResultSet getDataForQuery21(Connection conn) throws SQLException, ClassNotFoundException 
	{
		ResultSet result;
		String query = "SELECT argument1, relation, argument2 FROM nlpprojschema.extracted_tuples WHERE doc_id = 21;";
		result = getData(conn,query);
		return result;
	}
	
	public ResultSet getDocForQuery21(Connection conn) throws SQLException, ClassNotFoundException 
	{
		ResultSet result;
		String query = "SELECT news_document FROM nlpprojschema.document WHERE id = 21;";
		result = getData(conn,query);
		return result;
	}
	
	public ResultSet getDataForQuery22(Connection conn) throws SQLException, ClassNotFoundException 
	{
		ResultSet result;
		String query = "SELECT argument1, relation, argument2 FROM nlpprojschema.extracted_tuples WHERE doc_id = 22;";
		result = getData(conn,query);
		return result;
	}
	
	public ResultSet getDocForQuery22(Connection conn) throws SQLException, ClassNotFoundException 
	{
		ResultSet result;
		String query = "SELECT news_document FROM nlpprojschema.document WHERE id = 22;";
		result = getData(conn,query);
		return result;
	}
	
	public ResultSet getDataForQuery23(Connection conn) throws SQLException, ClassNotFoundException 
	{
		ResultSet result;
		String query = "SELECT argument1, relation, argument2 FROM nlpprojschema.extracted_tuples WHERE doc_id = 28;";
		result = getData(conn,query);
		return result;
	}
	
	public ResultSet getDocForQuery23(Connection conn) throws SQLException, ClassNotFoundException 
	{
		ResultSet result;
		String query = "SELECT news_document FROM nlpprojschema.document WHERE id = 28;";
		result = getData(conn,query);
		return result;
	}
	
	private ResultSet getData(Connection conn, String query) throws SQLException 
	{
		ResultSet result;
		Statement statement = null;
		statement = conn.createStatement();
	    result = statement.executeQuery(query);
		
		return result;
	}
	
	public void closeDBConnection(Connection conn) throws ClassNotFoundException
	{	
		try 
		{
			if (conn != null && !conn.isClosed()) 
			{
				conn.close();
			}
		} 
		catch (SQLException ex) 
		{
			ex.printStackTrace();
		}
	}
	
}
