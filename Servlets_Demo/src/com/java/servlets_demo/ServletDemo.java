package com.java.servlets_demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet
 */
@WebServlet("/ServletDemo")
public class ServletDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ServletDemo() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*String User_name=request.getParameter("User_name");
		String Password=request.getParameter("Password");
		if(User_name.equals("admin")&&Password.equals("admin")) 
			System.out.println("valid user");
		else
		System.out.println("Invalid user");*/			
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		// TODO Auto-generated method stub
		/*doGet(request, response);
		PrintWriter out=response.getWriter();
		String User_name=request.getParameter("User_name");
		String Password=request.getParameter("Password");
		if(User_name.equals("admin")&&Password.equals("admin")) 
			out.println("valid user");
		else
			out.println("invalid user");*/
		
	  
	    
	   
	        
	        
	        //-------- request methods------------
	        /*
	        PrintWriter out=response.getWriter();
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
	        }*/
	        
	        //}
	        /*String cardType=request.getParameter("cardType");
	        out.println(cardType);*/
	        /*for(String l:lang)
	        {
	            out.println(l);
	        }*/
	        
	        
	        //----------validate credentials--------
	        
	        /*PrintWriter out=response.getWriter();
	        String username=request.getParameter("username");
	        String password=request.getParameter("password");
	        if(username.equals("admin") && password.equals("admin")) {
	            out.println("valid user");
	    else {
	            out.println("invalid user");
	        }*/
	        
	        
	        //-------Request dispatcher interface--------
	        
	        PrintWriter out=response.getWriter();
	        response.setContentType("text/html");
	        
	        String username=request.getParameter("username");
	        String password=request.getParameter("Password");
	        if(username.equals("admin") && password.equals("admin")) {
	            //RequestDispatcher dispatch=request.getRequestDispatcher("Welcome.html");
	        	RequestDispatcher dispatch=getServletContext().getRequestDispatcher("Welcome.html");
	            dispatch.forward(request, response);
	        }
	        else {
	            out.println("Sorry username and password error");
	           // RequestDispatcher dispatch=request.getRequestDispatcher("Login.html");
	            RequestDispatcher dispatch=getServletContext().getRequestDispatcher("Login.html");
	            dispatch.include(request, response);
	        }
	        System.out.println("doPost");
	    }
}
	

