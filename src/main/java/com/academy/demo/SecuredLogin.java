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
			out.println("<a href=\"Student.jsp\">Go To XI Student Portal</a>");
			out.println("<p>");
			out.println("<a href=\"student1.jsp\">Go To XII Student Portal</a>");
			out.println("<p>");
			out.println("<a href=\"Teacher.jsp\">Go To Teacher Portal</a>");
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
	
		
		
		
			 
			
	
				
	
			
