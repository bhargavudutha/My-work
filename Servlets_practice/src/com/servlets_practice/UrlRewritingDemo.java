package com.servlets_practice;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 

@WebServlet("/UrlRewritingDemo")
public class UrlRewritingDemo extends HttpServlet {
    private static final long serialVersionUID = 1L;
   

 

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("username");
        String pass = request.getParameter("password");
        
        if(pass.equals("1234"))
        {
            response.sendRedirect("UrlRewritingDemo2?user_name="+ name);
        }
    }

 


}
 