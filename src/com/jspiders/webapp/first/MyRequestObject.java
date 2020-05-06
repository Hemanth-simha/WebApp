package com.jspiders.webapp.first;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyRequestObject extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req,
		HttpServletResponse resp) throws ServletException, IOException {
		
		
		String method = req.getMethod();
		StringBuffer url = req.getRequestURL();
	 	String protocol = req.getProtocol();
		
	 	String name = req.getParameter("name");
	 	String email= req.getParameter("email");
	 	String password= req.getParameter("password");
	 	String[] gender=req.getParameterValues("gender");
	  	String dob = req.getParameter("dob");
	 	String addressLine = req.getParameter("addressLine");
	 	String city = req.getParameter("city");
	 	String state = req.getParameter("state");
	 	String[] country=req.getParameterValues("country");
	 	String contact = req.getParameter("contact");
	 	
		PrintWriter out = resp.getWriter();
		out.println(" method = "+method);
		out.println(" url = "+url);
		out.println(" protocol = "+protocol);
		
		out.println(" name = "+name);
		out.println(" email = "+email);
		out.println(" Password = "+password);
		out.println(" gender = "+gender[0]);
		out.println(" dob = "+dob);
		out.println(" addressLine = "+addressLine);
		out.println(" city = "+city);
		out.println(" state = "+state);
		out.println(" country = "+country[0]);
		out.println(" contact = "+contact);
	}
	
}
