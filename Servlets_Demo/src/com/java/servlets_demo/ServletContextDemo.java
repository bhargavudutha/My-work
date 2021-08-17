package com.java.servlets_demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletContextDemo")
public class ServletContextDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ServletContext context;
     public void init(ServletConfig config) throws ServletException {
	 context=config.getServletContext();
	}

	
	

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		//String driver=request.getContext
		out.println(context.getInitParameter("driver"));
	}

	
	

}
