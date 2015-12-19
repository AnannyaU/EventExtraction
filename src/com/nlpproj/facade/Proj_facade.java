package com.nlpproj.facade;

import java.sql.Connection;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.nlpproj.dao.Dao;
import com.nlpproj.dbconn.Dbconn;
import java.io.File;
//import java.io.FileOutputStream;
import java.io.FileWriter;
//import java.io.InputStream;
import java.io.Reader;


public class Proj_facade 
{
	Dao dao_obj = new Dao();
	FileWriter output = null;
	Reader input = null;
	
	private Connection createDBConnection() throws ClassNotFoundException
	{
		Dbconn connector = new Dbconn();
		Connection conn = connector.createConnection();
		return conn;
	}
	
	private List<String[]> convertResultToArray(ResultSet result) throws SQLException
	{
		int nCol = result.getMetaData().getColumnCount();
		List<String[]> records = new ArrayList<String[]>();
		while(result.next()) 
		{
		    String[] row = new String[nCol];
		    for( int iCol = 1; iCol <= nCol; iCol++ )
		    {
		        row[iCol-1] = result.getObject( iCol ).toString();
		    }
		    records.add( row );
		}

		return records;
	}
	
	public List<String[]> getDataForQuery1() throws ClassNotFoundException, SQLException
	{
		Connection conn = createDBConnection();
		ResultSet result = dao_obj.getDataForQuery1(conn);
		List<String[]> records = convertResultToArray(result);
		dao_obj.closeDBConnection(conn);
		return records;
	}
	
	public List<String[]> getDataForQuery2() throws ClassNotFoundException, SQLException
	{
		Connection conn = createDBConnection();
		ResultSet result = dao_obj.getDataForQuery2(conn);
		List<String[]> records = convertResultToArray(result);
		dao_obj.closeDBConnection(conn);
		return records;
	}

	public List<String[]> getDataForQuery3() throws ClassNotFoundException, SQLException
	{
		Connection conn = createDBConnection();
		ResultSet result = dao_obj.getDataForQuery3(conn);
		List<String[]> records = convertResultToArray(result);
		dao_obj.closeDBConnection(conn);
		return records;
	}

	public List<String[]> getDataForQuery4() throws ClassNotFoundException, SQLException
	{
		Connection conn = createDBConnection();
		ResultSet result = dao_obj.getDataForQuery4(conn);
		List<String[]> records = convertResultToArray(result);
		dao_obj.closeDBConnection(conn);
		return records;
	}
	
	public List<String[]> getDataForQuery5() throws ClassNotFoundException, SQLException
	{
		Connection conn = createDBConnection();
		ResultSet result = dao_obj.getDataForQuery5(conn);
		List<String[]> records = convertResultToArray(result);
		dao_obj.closeDBConnection(conn);
		return records;
	}
	
	public List<String[]> getDataForQuery6() throws ClassNotFoundException, SQLException
	{
		Connection conn = createDBConnection();
		ResultSet result = dao_obj.getDataForQuery6(conn);
		List<String[]> records = convertResultToArray(result);
		dao_obj.closeDBConnection(conn);
		return records;
	}

	public List<String[]> getDataForQuery7() throws ClassNotFoundException, SQLException
	{
		Connection conn = createDBConnection();
		ResultSet result = dao_obj.getDataForQuery7(conn);
		List<String[]> records = convertResultToArray(result);
		dao_obj.closeDBConnection(conn);
		return records;
	}

	public List<String[]> getDataForQuery8() throws ClassNotFoundException, SQLException
	{
		Connection conn = createDBConnection();
		ResultSet result = dao_obj.getDataForQuery8(conn);
		List<String[]> records = convertResultToArray(result);
		dao_obj.closeDBConnection(conn);
		return records;
	}
	
	public List<String[]> getDataForQuery9() throws ClassNotFoundException, SQLException
	{
		Connection conn = createDBConnection();
		ResultSet result = dao_obj.getDataForQuery9(conn);
		List<String[]> records = convertResultToArray(result);
		dao_obj.closeDBConnection(conn);
		return records;
	}
	
	public List<String[]> getDataForQuery10() throws ClassNotFoundException, SQLException
	{
		Connection conn = createDBConnection();
		ResultSet result = dao_obj.getDataForQuery10(conn);
		List<String[]> records = convertResultToArray(result);
		dao_obj.closeDBConnection(conn);
		return records;
	}
	
	public List<String[]> getDataForQuery11() throws ClassNotFoundException, SQLException
	{
		Connection conn = createDBConnection();
		ResultSet result = dao_obj.getDataForQuery11(conn);
		List<String[]> records = convertResultToArray(result);
		dao_obj.closeDBConnection(conn);
		return records;
	}

	public List<String[]> getDataForQuery12() throws ClassNotFoundException, SQLException
	{
		Connection conn = createDBConnection();
		ResultSet result = dao_obj.getDataForQuery12(conn);
		List<String[]> records = convertResultToArray(result);
		dao_obj.closeDBConnection(conn);
		return records;
	}
	
	public List<String[]> getDataForQuery13() throws ClassNotFoundException, SQLException
	{
		Connection conn = createDBConnection();
		ResultSet result = dao_obj.getDataForQuery13(conn);
		List<String[]> records = convertResultToArray(result);
		dao_obj.closeDBConnection(conn);
		return records;
	}
	
	public List<String[]> getDataForQuery14() throws ClassNotFoundException, SQLException
	{
		Connection conn = createDBConnection();
		ResultSet result = dao_obj.getDataForQuery14(conn);
		List<String[]> records = convertResultToArray(result);
		dao_obj.closeDBConnection(conn);
		return records;
	}
	
	public List<String[]> getDataForQuery15() throws ClassNotFoundException, SQLException
	{
		Connection conn = createDBConnection();
		ResultSet result = dao_obj.getDataForQuery15(conn);
		List<String[]> records = convertResultToArray(result);
		dao_obj.closeDBConnection(conn);
		return records;
	}
	
	public List<String[]> getDataForQuery16() throws ClassNotFoundException, SQLException
	{
		Connection conn = createDBConnection();
		ResultSet result = dao_obj.getDataForQuery16(conn);
		List<String[]> records = convertResultToArray(result);
		dao_obj.closeDBConnection(conn);
		return records;
	}
	
	public List<String[]> getDataForQuery17() throws ClassNotFoundException, SQLException
	{
		Connection conn = createDBConnection();
		ResultSet result = dao_obj.getDataForQuery17(conn);
		List<String[]> records = convertResultToArray(result);
		dao_obj.closeDBConnection(conn);
		return records;
	}
	
	public List<String[]> getDataForQuery18() throws ClassNotFoundException, SQLException
	{
		Connection conn = createDBConnection();
		ResultSet result = dao_obj.getDataForQuery18(conn);
		List<String[]> records = convertResultToArray(result);
		dao_obj.closeDBConnection(conn);
		return records;
	}
	
	public List<String[]> getDataForQuery19() throws ClassNotFoundException, SQLException
	{
		Connection conn = createDBConnection();
		ResultSet result = dao_obj.getDataForQuery19(conn);
		List<String[]> records = convertResultToArray(result);
		dao_obj.closeDBConnection(conn);
		return records;
	}
	
	public List<String[]> getDataForQuery20() throws ClassNotFoundException, SQLException
	{
		Connection conn = createDBConnection();
		ResultSet result = dao_obj.getDataForQuery20(conn);
		List<String[]> records = convertResultToArray(result);
		dao_obj.closeDBConnection(conn);
		return records;
	}
	
	public List<String[]> getDataForQuery21() throws ClassNotFoundException, SQLException
	{
		Connection conn = createDBConnection();
		ResultSet result = dao_obj.getDataForQuery21(conn);
		List<String[]> records = convertResultToArray(result);
		dao_obj.closeDBConnection(conn);
		return records;
	}
	
	public List<String[]> getDataForQuery22() throws ClassNotFoundException, SQLException
	{
		Connection conn = createDBConnection();
		ResultSet result = dao_obj.getDataForQuery22(conn);
		List<String[]> records = convertResultToArray(result);
		dao_obj.closeDBConnection(conn);
		return records;
	}
	
	public List<String[]> getDataForQuery23() throws ClassNotFoundException, SQLException
	{
		Connection conn = createDBConnection();
		ResultSet result = dao_obj.getDataForQuery23(conn);
		List<String[]> records = convertResultToArray(result);
		dao_obj.closeDBConnection(conn);
		return records;
	}
	
	private File convertResultToFile(ResultSet result) throws Exception
	{
		File theFile = new File("newsdoc_from_db.txt");
		output = new FileWriter(theFile);
		
		if (result.next()) 
		{

			input = result.getCharacterStream("news_document"); 
			
			int theChar;
			while ((theChar = input.read()) > 0) 
			{
				output.write(theChar);
			}			
		}
		if (input != null) 
		{
			input.close();
		}

		if (output != null) 
		{
			output.close();
		}
		return theFile;
	}
	
	public File getDocForQuery1() throws Exception
	{
		Connection conn = createDBConnection();
		ResultSet result = dao_obj.getDocForQuery1(conn);
		File news_doc = convertResultToFile(result); 
		dao_obj.closeDBConnection(conn);
		return news_doc;
	}
	
	public File getDocForQuery2() throws Exception
	{
		Connection conn = createDBConnection();
		ResultSet result = dao_obj.getDocForQuery2(conn);
		File news_doc = convertResultToFile(result); 
		dao_obj.closeDBConnection(conn);
		return news_doc;
	}
	
	public File getDocForQuery3() throws Exception
	{
		Connection conn = createDBConnection();
		ResultSet result = dao_obj.getDocForQuery3(conn);
		File news_doc = convertResultToFile(result); 
		dao_obj.closeDBConnection(conn);
		return news_doc;
	}
	
	public File getDocForQuery4() throws Exception
	{
		Connection conn = createDBConnection();
		ResultSet result = dao_obj.getDocForQuery4(conn);
		File news_doc = convertResultToFile(result); 
		dao_obj.closeDBConnection(conn);
		return news_doc;
	}

	public File getDocForQuery5() throws Exception
	{
		Connection conn = createDBConnection();
		ResultSet result = dao_obj.getDocForQuery5(conn);
		File news_doc = convertResultToFile(result); 
		dao_obj.closeDBConnection(conn);
		return news_doc;
	}
	
	public File getDocForQuery6() throws Exception
	{
		Connection conn = createDBConnection();
		ResultSet result = dao_obj.getDocForQuery6(conn);
		File news_doc = convertResultToFile(result); 
		dao_obj.closeDBConnection(conn);
		return news_doc;
	}
	
	public File getDocForQuery7() throws Exception
	{
		Connection conn = createDBConnection();
		ResultSet result = dao_obj.getDocForQuery7(conn);
		File news_doc = convertResultToFile(result); 
		dao_obj.closeDBConnection(conn);
		return news_doc;
	}
	
	public File getDocForQuery8() throws Exception
	{
		Connection conn = createDBConnection();
		ResultSet result = dao_obj.getDocForQuery8(conn);
		File news_doc = convertResultToFile(result); 
		dao_obj.closeDBConnection(conn);
		return news_doc;
	}

	public File getDocForQuery9() throws Exception
	{
		Connection conn = createDBConnection();
		ResultSet result = dao_obj.getDocForQuery9(conn);
		File news_doc = convertResultToFile(result); 
		dao_obj.closeDBConnection(conn);
		return news_doc;
	}
	
	public File getDocForQuery10() throws Exception
	{
		Connection conn = createDBConnection();
		ResultSet result = dao_obj.getDocForQuery10(conn);
		File news_doc = convertResultToFile(result); 
		dao_obj.closeDBConnection(conn);
		return news_doc;
	}

	public File getDocForQuery11() throws Exception
	{
		Connection conn = createDBConnection();
		ResultSet result = dao_obj.getDocForQuery11(conn);
		File news_doc = convertResultToFile(result); 
		dao_obj.closeDBConnection(conn);
		return news_doc;
	}
	
	public File getDocForQuery12() throws Exception
	{
		Connection conn = createDBConnection();
		ResultSet result = dao_obj.getDocForQuery12(conn);
		File news_doc = convertResultToFile(result); 
		dao_obj.closeDBConnection(conn);
		return news_doc;
	}
	
	public File getDocForQuery13() throws Exception
	{
		Connection conn = createDBConnection();
		ResultSet result = dao_obj.getDocForQuery13(conn);
		File news_doc = convertResultToFile(result); 
		dao_obj.closeDBConnection(conn);
		return news_doc;
	}
	
	public File getDocForQuery14() throws Exception
	{
		Connection conn = createDBConnection();
		ResultSet result = dao_obj.getDocForQuery14(conn);
		File news_doc = convertResultToFile(result); 
		dao_obj.closeDBConnection(conn);
		return news_doc;
	}
	
	public File getDocForQuery15() throws Exception
	{
		Connection conn = createDBConnection();
		ResultSet result = dao_obj.getDocForQuery15(conn);
		File news_doc = convertResultToFile(result); 
		dao_obj.closeDBConnection(conn);
		return news_doc;
	}
	
	public File getDocForQuery16() throws Exception
	{
		Connection conn = createDBConnection();
		ResultSet result = dao_obj.getDocForQuery16(conn);
		File news_doc = convertResultToFile(result); 
		dao_obj.closeDBConnection(conn);
		return news_doc;
	}
	
	public File getDocForQuery17() throws Exception
	{
		Connection conn = createDBConnection();
		ResultSet result = dao_obj.getDocForQuery17(conn);
		File news_doc = convertResultToFile(result); 
		dao_obj.closeDBConnection(conn);
		return news_doc;
	}
	
	public File getDocForQuery18() throws Exception
	{
		Connection conn = createDBConnection();
		ResultSet result = dao_obj.getDocForQuery18(conn);
		File news_doc = convertResultToFile(result); 
		dao_obj.closeDBConnection(conn);
		return news_doc;
	}
	
	public File getDocForQuery19() throws Exception
	{
		Connection conn = createDBConnection();
		ResultSet result = dao_obj.getDocForQuery19(conn);
		File news_doc = convertResultToFile(result); 
		dao_obj.closeDBConnection(conn);
		return news_doc;
	}
	
	public File getDocForQuery20() throws Exception
	{
		Connection conn = createDBConnection();
		ResultSet result = dao_obj.getDocForQuery20(conn);
		File news_doc = convertResultToFile(result); 
		dao_obj.closeDBConnection(conn);
		return news_doc;
	}
	
	public File getDocForQuery21() throws Exception
	{
		Connection conn = createDBConnection();
		ResultSet result = dao_obj.getDocForQuery21(conn);
		File news_doc = convertResultToFile(result); 
		dao_obj.closeDBConnection(conn);
		return news_doc;
	}
	
	public File getDocForQuery22() throws Exception
	{
		Connection conn = createDBConnection();
		ResultSet result = dao_obj.getDocForQuery22(conn);
		File news_doc = convertResultToFile(result); 
		dao_obj.closeDBConnection(conn);
		return news_doc;
	}
	
	public File getDocForQuery23() throws Exception
	{
		Connection conn = createDBConnection();
		ResultSet result = dao_obj.getDocForQuery23(conn);
		File news_doc = convertResultToFile(result); 
		dao_obj.closeDBConnection(conn);
		return news_doc;
	}
	
	public void postDataForQuery1(String[] filtered_tuples) throws ClassNotFoundException, SQLException
	{
		Connection conn = createDBConnection();
		dao_obj.postDataForQuery1(conn, filtered_tuples);
		dao_obj.closeDBConnection(conn);
		
	}
	
	public void postDataForQuery2(String[] filtered_tuples) throws ClassNotFoundException, SQLException
	{
		Connection conn = createDBConnection();
		dao_obj.postDataForQuery2(conn, filtered_tuples);
		dao_obj.closeDBConnection(conn);
		
	}
	
	public void postDataForQuery3(String[] filtered_tuples) throws ClassNotFoundException, SQLException
	{
		Connection conn = createDBConnection();
		dao_obj.postDataForQuery3(conn, filtered_tuples);
		dao_obj.closeDBConnection(conn);
		
	}
	
	public void postDataForQuery4(String[] filtered_tuples) throws ClassNotFoundException, SQLException
	{
		Connection conn = createDBConnection();
		dao_obj.postDataForQuery4(conn, filtered_tuples);
		dao_obj.closeDBConnection(conn);
		
	}
	
	public void postDataForQuery5(String[] filtered_tuples) throws ClassNotFoundException, SQLException
	{
		Connection conn = createDBConnection();
		dao_obj.postDataForQuery5(conn, filtered_tuples);
		dao_obj.closeDBConnection(conn);
		
	}
	
	public void postDataForQuery6(String[] filtered_tuples) throws ClassNotFoundException, SQLException
	{
		Connection conn = createDBConnection();
		dao_obj.postDataForQuery6(conn, filtered_tuples);
		dao_obj.closeDBConnection(conn);
		
	}
	
	public void postDataForQuery7(String[] filtered_tuples) throws ClassNotFoundException, SQLException
	{
		Connection conn = createDBConnection();
		dao_obj.postDataForQuery7(conn, filtered_tuples);
		dao_obj.closeDBConnection(conn);
		
	}
	
	public void postDataForQuery8(String[] filtered_tuples) throws ClassNotFoundException, SQLException
	{
		Connection conn = createDBConnection();
		dao_obj.postDataForQuery8(conn, filtered_tuples);
		dao_obj.closeDBConnection(conn);
		
	}
	
	public void postDataForQuery9(String[] filtered_tuples) throws ClassNotFoundException, SQLException
	{
		Connection conn = createDBConnection();
		dao_obj.postDataForQuery9(conn, filtered_tuples);
		dao_obj.closeDBConnection(conn);
		
	}
	
	public void postDataForQuery10(String[] filtered_tuples) throws ClassNotFoundException, SQLException
	{
		Connection conn = createDBConnection();
		dao_obj.postDataForQuery10(conn, filtered_tuples);
		dao_obj.closeDBConnection(conn);
		
	}
	
	public void postDataForQuery11(String[] filtered_tuples) throws ClassNotFoundException, SQLException
	{
		Connection conn = createDBConnection();
		dao_obj.postDataForQuery11(conn, filtered_tuples);
		dao_obj.closeDBConnection(conn);
		
	}
	
	public void postDataForQuery12(String[] filtered_tuples) throws ClassNotFoundException, SQLException
	{
		Connection conn = createDBConnection();
		dao_obj.postDataForQuery12(conn, filtered_tuples);
		dao_obj.closeDBConnection(conn);
		
	}
	
	public void postDataForQuery13(String[] filtered_tuples) throws ClassNotFoundException, SQLException
	{
		Connection conn = createDBConnection();
		dao_obj.postDataForQuery13(conn, filtered_tuples);
		dao_obj.closeDBConnection(conn);
		
	}
	
	public void postDataForQuery14(String[] filtered_tuples) throws ClassNotFoundException, SQLException
	{
		Connection conn = createDBConnection();
		dao_obj.postDataForQuery14(conn, filtered_tuples);
		dao_obj.closeDBConnection(conn);
		
	}
	
	public void postDataForQuery15(String[] filtered_tuples) throws ClassNotFoundException, SQLException
	{
		Connection conn = createDBConnection();
		dao_obj.postDataForQuery15(conn, filtered_tuples);
		dao_obj.closeDBConnection(conn);
		
	}
	
	public void postDataForQuery16(String[] filtered_tuples) throws ClassNotFoundException, SQLException
	{
		Connection conn = createDBConnection();
		dao_obj.postDataForQuery16(conn, filtered_tuples);
		dao_obj.closeDBConnection(conn);
		
	}
	
	public void postDataForQuery17(String[] filtered_tuples) throws ClassNotFoundException, SQLException
	{
		Connection conn = createDBConnection();
		dao_obj.postDataForQuery17(conn, filtered_tuples);
		dao_obj.closeDBConnection(conn);
		
	}
	
	public void postDataForQuery18(String[] filtered_tuples) throws ClassNotFoundException, SQLException
	{
		Connection conn = createDBConnection();
		dao_obj.postDataForQuery18(conn, filtered_tuples);
		dao_obj.closeDBConnection(conn);
		
	}
	
	public void postDataForQuery19(String[] filtered_tuples) throws ClassNotFoundException, SQLException
	{
		Connection conn = createDBConnection();
		dao_obj.postDataForQuery19(conn, filtered_tuples);
		dao_obj.closeDBConnection(conn);
		
	}
	
	public void postDataForQuery20(String[] filtered_tuples) throws ClassNotFoundException, SQLException
	{
		Connection conn = createDBConnection();
		dao_obj.postDataForQuery20(conn, filtered_tuples);
		dao_obj.closeDBConnection(conn);
		
	}
	
	public void postDataForQuery21(String[] filtered_tuples) throws ClassNotFoundException, SQLException
	{
		Connection conn = createDBConnection();
		dao_obj.postDataForQuery21(conn, filtered_tuples);
		dao_obj.closeDBConnection(conn);
		
	}
	
	public void postDataForQuery22(String[] filtered_tuples) throws ClassNotFoundException, SQLException
	{
		Connection conn = createDBConnection();
		dao_obj.postDataForQuery22(conn, filtered_tuples);
		dao_obj.closeDBConnection(conn);
		
	}
	
	public void postDataForQuery23(String[] filtered_tuples) throws ClassNotFoundException, SQLException
	{
		Connection conn = createDBConnection();
		dao_obj.postDataForQuery23(conn, filtered_tuples);
		dao_obj.closeDBConnection(conn);
		
	}
}
