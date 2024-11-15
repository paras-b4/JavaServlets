package com.paras;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Myservlet extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		/*
		 * Servletcontex & servletconfig 
		 */
		PrintWriter out=res.getWriter();
		out.print("hi " );
		
		
		/*ServletContext ctx = getServletContext();   // ServletContex is used to provide initial parameter or configuration information to the servlet  and ServletContext is available for all Servlets in the web application
		String s= ctx.getInitParameter("name");
		out.println(s);*/
		
		ServletConfig cfg= getServletConfig();
		String s1= getInitParameter("gadget");
		out.println(s1);
	}
	

}
