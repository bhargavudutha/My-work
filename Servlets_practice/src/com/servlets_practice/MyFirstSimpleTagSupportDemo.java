package com.servlets_practice;
import java.io.IOException;
import java.io.StringWriter;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.BodyContent;
import javax.servlet.jsp.tagext.BodyTagSupport;
import javax.servlet.jsp.tagext.SimpleTagSupport;
public class MyFirstSimpleTagSupportDemo extends SimpleTagSupport{
 /*private String color;
    public String getColor() {
    return color;
}
public void setColor(String color) {
    this.color = color;
}*/
    //------Scriptless Tag------
     StringWriter sw=new StringWriter();
    public void doTag() throws IOException, JspException{
      getJspBody().invoke(sw);
      JspWriter out=getJspContext().getOut();
      out.println(sw+"Scriptless tag");
  }
    //------JSP BODY CONTENT------
    /*private String color;
    
    public void setColor(String color) {
        this.color = color;
    }

 

    public int doAfterBody() {
        try {
        BodyContent bc=getBodyContent();
        String bodyContent=bc.getString();
        JspWriter out=bc.getEnclosingWriter();
        //out.println("<body bgcolor="+color+">");
        out.println("<p style='color:"+color+"'>"+bodyContent+"</p>");
        }
        catch(Exception e)
        {}
        return SKIP_BODY;
    }*/
    
}



