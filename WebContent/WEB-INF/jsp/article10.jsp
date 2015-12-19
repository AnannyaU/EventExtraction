<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List"%>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.io.File" %>
<%@ page import="java.io.FileReader" %>
<%@ page import="java.io.BufferedReader" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>NLP project web interface</title>
</head>
<body background="background.png">
<%
	List<String[]> list = (List<String[]>)request.getAttribute("records");
	File doc = (File) request.getAttribute("doc");
	String str = null;
	String value_string = "";
	//String query =  (String) request.getAttribute("query");

	if(doc != null)
	{
		BufferedReader reader = new BufferedReader(new FileReader(doc));
        StringBuilder sb = new StringBuilder();
        String line;

        while((line = reader.readLine())!= null)
        {
            sb.append(line+"\n");
        }
        str = sb.toString(); 
        
        reader.close();
	}
	out.println("<BR>");
	out.println("<form action=\"news10_tuples\" method=\"post\">");
	out.println("<center>");
	out.println("<table border =\"1\"> ");
	out.println("<tr><td colspan = \"4\">" + str + "</td></tr>");
	if(!list.isEmpty() && list != null)
	{
		out.println("<BR><BR><BR>");
		out.println("<tr><td></td><td><b> Argument 1 </b></td><td><b> Relation </b></td><td><b> Argument 2 </b></td></tr>");
		for( String[] row: list)
		{
			out.println("<tr>");
			value_string = "";
			for( String s: row )
	    		 value_string = value_string + "*" + s;
			out.println("<td><input type=\"checkbox\" name=\"news_tuple\" value=\""+ value_string +"\"></td>");
	    	for( String s: row )
	    	{
	       		out.println( "<td> " + s + "</td>" );
	    	} 
	    	out.println("</tr>");
		}
		out.println("<tr><td><input type=\"checkbox\" name=\"news_tuple\" value=\"None\"\"></td><td colspan = \"3\">None</td></tr>");
		out.println("</table>");
		out.println("<input type=\"submit\" name=\"Submit\" />");
	}
	out.println("</form>");
	out.println("</center>");
%>
</body>
</html>