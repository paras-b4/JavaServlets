package com.paras;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/add") // this is called annotations
public class Addservlet extends HttpServlet 
{
	public void doGet(HttpServletRequest req , HttpServletResponse res) throws IOException, ServletException
	{
		int i= Integer.parseInt(req.getParameter("num1"));
		int j= Integer.parseInt(req.getParameter("num2"));
		int k= i+j;
		
		//Cookie cookie= new Cookie("k",k+"");
		Cookie cookie= new Cookie("k",String.valueOf(k));
		
		res.addCookie(cookie);
		res.sendRedirect("sq");
		
		
		/*HttpSession session = req.getSession(); // HttpSession  this is another way to pass a value from one servlet to another servlet
		session.setAttribute("k",k);
		res.sendRedirect("sq");*/
		
		
		//res.sendRedirect("sq?k="+k);  // URL Rewritting         this is one way to pass a value from one servlet to another servlet
		
		//System.out.println("result is : " + k);
		
		//PrintWriter out = res.getWriter();
		//out.println("result is : " + k);
		
		/*req.setAttribute("A", k);
		RequestDispatcher rd= req.getRequestDispatcher("sq");
		rd.forward(req, res);*/
		
	}
		
	



}
