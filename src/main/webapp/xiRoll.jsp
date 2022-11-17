<%@page import="com.academy.web.model.XIStudent"%>
<%@page import="java.sql.*"%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>XI Student Portal</title>
</head>
<body>
<h2> Welcome to XII Class Portal</h2>
<table border="2" width="70%">
	
<% 
 String num= request.getParameter("numb");
 Connection conn = null;
 Statement st= null;
 ResultSet rs=null;
 String Q=num;
 try
  {
   Class.forName("com.mysql.jdbc.Driver");
   conn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","Sheetaldixit1234");
   st=conn.createStatement();
   String qry="select *  from xistudent where RollNo = "+num ; 
   rs=st.executeQuery(qry);
   while(rs.next())
   {
	   %>
	   <tr>
	   	<td><%=rs.getString(1)%></td>
	   	<td><%=rs.getString(2)%></td>
	   	<td><%=rs.getInt(3)%></td>
	   	
	   	
	   </tr>
	   
	   <%
   }	   
   
  }catch(Exception ex){}
 %>
</table>
</body>
</html>


 