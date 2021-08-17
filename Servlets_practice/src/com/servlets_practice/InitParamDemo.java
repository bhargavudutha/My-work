package com.servlets_practice;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*@WebServlet(urlPatterns="/InitParamDemo"
initParams= {
		//@WebInitParam(name="email",value="abc@gmail.com"),
		@WebInitParam(name="author",value="Bhargav")
		
}
		)*/
public class InitParamDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String email=getInitParameter("email");
		String author=getInitParameter("Bhargav");
	}

	

}