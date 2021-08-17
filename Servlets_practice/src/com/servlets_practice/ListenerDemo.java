package com.servlets_practice;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;


@WebListener
public class ListenerDemo implements HttpSessionListener {

    
    public ListenerDemo() {
        // TODO Auto-generated constructor stub
    }


    public void sessionCreated(HttpSessionEvent se)  { 
    	System.out.println("Session created");
         
    }

	
    public void sessionDestroyed(HttpSessionEvent se)  { 
         // TODO Auto-generated method stub
    }
	
}
