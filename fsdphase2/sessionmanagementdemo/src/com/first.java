package com;

import dto.*;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class first
 */
@WebServlet("/first")
public class first extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
 
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		user user=new user();
		 
		HttpSession session=req.getSession();
		user.setFname(req.getParameter("fname"));
		user.setLname(req.getParameter("lname"));
	//	out.println(user.getLname());
		
		session.setAttribute("user",user);
		resp.sendRedirect("2.html");
		
		
		
	}

}
