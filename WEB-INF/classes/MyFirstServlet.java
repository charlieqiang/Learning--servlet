package com.charlie;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class MyFirstServlet implements Servlet{
	//init servlet and load into memery
	public void init(ServletConfig config) throws ServletException{
		
	}
	
	//get an servlet obj
	public ServletConfig getServletConfig(){
		return null;
	}
	
	//service
	public void service(ServletRequest req, ServletResponse res) throws ServletException, java.io.IOException{
		System.out.println("hello,world");
		res.getWriter().println("helloWorld!");
	}
	
	//config
	public java.lang.String getServletInfo(){
		return null;
	}

	//destroy
	public void destroy(){
	
	}
	
}