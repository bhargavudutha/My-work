package com.servlets_practice;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

 

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 


@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        String confirmpassword=request.getParameter("confirmpassword");
        PrintWriter out=response.getWriter();
        if(password.equals(confirmpassword)) {
            RequestDispatcher rd=request.getRequestDispatcher("Login.jsp");
            rd.forward(request, response);
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/petpeers", "root", "root");
            Statement st=con.createStatement();
            st.executeUpdate("insert into register values('"+username+"','"+password+"')");
            out.println("Success");
            
            
        }
        catch(Exception e) {
            
        }}
        else {
            out.println("Enter a valid password");
            RequestDispatcher rd=request.getRequestDispatcher("Register.jsp");
            rd.include(request, response);
        }
    }

 

}
