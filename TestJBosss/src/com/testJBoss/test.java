package com.testJBoss;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class test
 */
@WebServlet("/hello.html")
public class test extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	PrintWriter out	= response.getWriter();
	
		 out.println("<html>");
		 out.println("<body>");
		 out.println("Servlet response say JBoss work Fine !!!");
		 out.println("</body>");
		 out.println("</html>");
		 
	}

}
