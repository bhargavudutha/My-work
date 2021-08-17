package com.servlets_practice;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/HiddenFormFieldDemo")
public class HiddenFormFieldDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        String username=request.getParameter("username");
	        PrintWriter out=response.getWriter();
	        out.println(username);
	         out.println("<form action='HiddenFormFieldDemo2' >");
	            out.println("<input type='hidden' name='user' value='"+username+"'>");
	            out.println("<input type='submit' value='submit' >");
	            out.println("</form>");
	       
	    
	}

}
