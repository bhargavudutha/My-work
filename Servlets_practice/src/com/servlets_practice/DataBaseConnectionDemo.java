package com.servlets_practice;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DataBaseConnectionDemo")
public class DataBaseConnectionDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

	        PrintWriter out=response.getWriter();
	        String username = request.getParameter("username");
	        String password = request.getParameter("password");
	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sample", "root", "root");
	            out.println("connection created");
	            Statement st=con.createStatement();
	            st.executeUpdate("insert into logindetails values('"+username+"','"+password+"')");
	            out.println("Success");
	        } catch (Exception e) {

	 

	        }
	        /*PrintWriter out=response.getWriter();
	        String username = request.getParameter("username");
	        String password = request.getParameter("password");
	        try {
	            Class.forName("com.mysql.jdbc.Driver");
	            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/mysql", "root", "root");
	            Statement st=con.createStatement();
	            st.executeUpdate("insert into logindetails values('"+username+"','"+username+"')");
	            out.println("Success");
	        } catch (Exception e) {

	 

	        }*/
	    }

	 

	}
	 
	
