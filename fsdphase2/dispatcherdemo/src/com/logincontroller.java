package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class logincontroller
 */
@WebServlet("/logincontroller")
public class logincontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public logincontroller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname=request.getParameter("uname");
		String pwd=request.getParameter("pwd");
		
		RequestDispatcher rd=null;
		PrintWriter out=response.getWriter();
		
		if(uname.equalsIgnoreCase("yo") && pwd.equalsIgnoreCase("ge"))
		{
			//out.println("success");
			rd=request.getRequestDispatcher("successservlet");
			rd.forward(request, response);
			
			
		}
		else
		{
			rd=request.getRequestDispatcher("login.html");
			
			rd.include(request, response);
			out.println("invalid cred");
		}
		
	}

}
