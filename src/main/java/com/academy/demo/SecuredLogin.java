package com.academy.demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecuredLogin
 */
@WebServlet("/securedlogin")
public class SecuredLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SecuredLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String username = request.getParameter("USER_NAME");
		String password = request.getParameter("PASSWORD");
		
		String ipaddress= request.getRemoteAddr();
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>My Academy</title>");
		out.println("</head>");
		out.println("<body>");
		if ( username.equals("sheetal")&& password.equals("1234")) {
			
		
			out.println("<h2>Welcome "+ username + " to MyAcademy</h2>");
			out.println("<a href=\"xiStudent.jsp\">Click here for XI Student List</a><p>");
						
			out.println("<a href=\"xiiStudent.jsp\">Click here for XII Student List</a><p>");
			
			out.println("<a href=\"xi_sub.jsp\">Click here to know about XI Class</a><p>");
			
			out.println("<a href=\"xii_sub.jsp\">Click here to know about XII Class</a><p>");
								
			out.println("<a href=\"xiRoll.html\">Click here to XI-Roll no wise information</a><p>");
			
			out.println("<a href=\"xiiRoll.html\">Click here to XII-Roll no wise information</a><p>");
							
			out.println("</body>");
			out.println("</html>");
			out.close();	
		}
		
		else 
		{out.println("<h2>Sorry You are not authorized for login</h2>");
		 out.close();
		}
		
	
	}
	}
	
		
		
		
			 
			
	
				
	
			
