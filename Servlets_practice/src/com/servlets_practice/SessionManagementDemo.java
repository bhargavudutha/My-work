package com.servlets_practice;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/SessionManagementDemo")
public class SessionManagementDemo extends HttpServlet {
    private static final long serialVersionUID = 1L;
       
  
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out=response.getWriter();
        String user=request.getParameter("username");
        out.println("Username"+user+"<Br/>");
        HttpSession session=request.getSession(); 
        session.setAttribute("username", user);
        out.println("Home Page"+"<Br/>");
        out.println("<a href='SessionManagementDemo2'>Snacks</a><br/>");
        out.println("<a href=''>Groceries</a>");
    }
    
	
		
		}