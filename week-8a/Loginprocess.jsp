<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>
<%
 int flag=0;
 String name=request.getParameter("username");
 String pwd=request.getParameter("userpass");
 try
 {
 Class.forName("com.mysql.jdbc.Driver");
 Connection
 con=DriverManager.getConnection("jdbc:mysql://localhost:3307/demo","admin","admin");
 Statement stmt=con.createStatement();
 String sql = "select * from user";
 ResultSet rs = stmt.executeQuery(sql);
 while(rs.next())
 {
 //Retrieve by column name

 	String user = rs.getString("name");
	String id = rs.getString("pass");
 	if(name.equals(user) && pwd.equals(id))
 	{
 		flag=1;
 	}
 }
 if(flag==1)
 	out.println("Login Successfully  "+name);
 else
 	out.println("Invalid user");
 }
 catch(Exception e)
 {
 	e.printStackTrace();
 }
 out.close();
%>
