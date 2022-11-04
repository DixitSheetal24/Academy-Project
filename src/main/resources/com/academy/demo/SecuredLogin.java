package com.academy.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/securedlogin")
public class SecuredLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    	protected void doPost(HttpServletRequest request, HttpServletResponse response)
    			throws ServletException, IOException {
    		
    		public class LoginServlet extends HttpServlet {
    			private static final long serialVersionUID = 1L;

    			
    			protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    				// TODO Auto-generated method stub
    				String username = request.getParameter("USER_NAME");
    				String password = request.getParameter("PASSWORD");
    				System.out.println("User Name :"+ username );
    				
    				  response.setContentType("text/html"); //MIME type
    			        
    			        PrintWriter out = response.getWriter();
    			        
    			        out.println("<!DOCTYPE html>");
    			        out.println("<html>");
    			        out.println("<head>");
    			        out.println("<title>simplilearn</title>");
    			        out.println("</head>");
    			        out.println("<body>");
    			        
    			        out.println("<h2>Welcome "+ username + " to simplilearn portal</h2>");
    					
    			        out.println("</body>");
    			        out.println("</html>");
    			        
    			        out.close();
    			    }

    			}
    	}

}
