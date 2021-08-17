package com.servlets_practice;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class FirstFilterServletDemo
 */
@WebFilter(urlPatterns="/FilterServletDemo")
public class FirstFilterServletDemo implements Filter {
    
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        PrintWriter out=response.getWriter();
        HttpServletRequest req=(HttpServletRequest) request;
        String name=req.getParameter("username");
        String password=req.getParameter("password");
        if(name.equals("admin") && password.equals("admin")) {
            chain.doFilter(req, response);
        }else {
            out.println("Invalid username or password");
            RequestDispatcher dispatch=request.getRequestDispatcher("FilterDemo.jsp");
            dispatch.include(req, response);
        }

 

    
    }
}

 


