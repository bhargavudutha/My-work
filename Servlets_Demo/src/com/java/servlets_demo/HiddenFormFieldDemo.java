package com.java.servlets_demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class HiddenFormFieldDemo
 */
@WebServlet("/HiddenFormFieldDemo")
public class HiddenFormFieldDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	        String username=request.getParameter("username");
	        PrintWriter out=response.getWriter();
	        out.println(username);
	         out.println("<form action='HiddenFormFieldDemo2'>");
	            out.println("<input type='hidden' name='user' value='"+username+"'>");
	            out.println("<input type='submit' value='submit' >");
	            out.println("</form>");
	       
	    }
		
		
	}


