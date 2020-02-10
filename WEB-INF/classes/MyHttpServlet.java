package com.charlie;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class MyHttpServlet extends HttpServlet{
	//
	protected void doGet(HttpServletRequest req,HttpServletResponse resp) 
	throws ServletException, java.io.IOException{
		resp.getWriter().println("i am httpServlet doGet()");
	}
	
	//
	protected void doPost(HttpServletRequest req,HttpServletResponse resp) 
	throws ServletException, java.io.IOException{
		resp.getWriter().println("i am httpServlet doPost() and your post name:" 
		+ req.getParameter("username"));
	}

}