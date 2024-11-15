package com.paras;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/sq")
public class Sqservlet extends HttpServlet 
{
	public void doGet(HttpServletRequest req , HttpServletResponse res)throws IOException 
	{
		int B=0;
		Cookie cookies[]=req.getCookies();
		for(Cookie c : cookies)
		{
			if(c.getName().equals("k"))
				 B= Integer.parseInt(c.getValue());
			
		}
		
		
		
		/*HttpSession session = req.getSession();
		int B=(int)session.getAttribute("k");*/
		
		//int B = Integer.parseInt(req.getParameter("k")); // url Rewritting
		
		//int B = (int)req.getAttribute("A"); // Request Dispatch
		
		B=B*B;
		
		PrintWriter out = res.getWriter();
		out.println("<html> <body bgcolor= pink>");
		out.println("Result is : " + B);
		out.println("</body> </html>");
	}


}
