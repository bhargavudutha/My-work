package com.servlets_practice;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletDemo")
public class ServletDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		/*PrintWriter out=response.getWriter();
		String user_name=request.getParameter("username");
		String password=request.getParameter("password");
		if(user_name.equals("admin")&&password.equals("admin")) 
		{
			out.println("valid user");
		}
		else
		{
			out.println("invalid user");
		}*/
		
	  
	    
	   
	        
	        
	        //-------- request methods------------
	        
	       /* PrintWriter out=response.getWriter();
	        String lang[]=new String[50];
	        Enumeration<String> en=request.getParameterNames();
	        while(en.hasMoreElements())
	        {
	        String param=en.nextElement();
	        if(param.equals("language"))
	        {
	        lang=request.getParameterValues(param);
	        for(String str:lang) {
	            out.println(str);
	        }
	        }
	        else {
	        String value=request.getParameter(param);
	        
	        out.println(value);
	        }
	        }*/
	        
	        //}
	        /*String cardType=request.getParameter("cardType");
	        out.println(cardType);*/
	        /*for(String l:lang)
	        {
	            out.println(l);
	        }*/
	        
	        
	        //----------validate credentials--------
	        
	       /* PrintWriter out=response.getWriter();
	        String username=request.getParameter("username");
	        String password=request.getParameter("password");
	        if(username.equals("admin") && password.equals("admin")) 
	            out.println("valid user");
	            else
	            	out.println("Invalid user");*/
	
	        
	        
	        //-------Request dispatcher interface--------
	        
	        /*PrintWriter out=response.getWriter();
	        //response.setContentType("text/html");
	        
	        String username=request.getParameter("username");
	        String password=request.getParameter("password");
	        if(username.equals("admin") && password.equals("admin")) {
	            //RequestDispatcher dispatch=request.getRequestDispatcher("Welcome.html");
	        	RequestDispatcher dispatch=getServletContext().getRequestDispatcher("/welcome.html");
	            dispatch.forward(request, response);
	        }
	        else {
	            out.println("Sorry username and password error");
	           // RequestDispatcher dispatch=request.getRequestDispatcher("Login.html");
	            RequestDispatcher dispatch=getServletContext().getRequestDispatcher("Login.html");
	            dispatch.include(request, response);
	        }
	        System.out.println("doPost");*/
	 
}
}