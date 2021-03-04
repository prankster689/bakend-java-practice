package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dto.user;

/**
 * Servlet implementation class summary
 */
@WebServlet("/summary")
public class summary extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public summary() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
			HttpSession session=request.getSession(false);
			
			if(session !=null)
			{
				user  user=(user)session.getAttribute("user");
				
				user.setContact(Integer.parseInt(request.getParameter("contact")));
				user.setCity(request.getParameter("city"));
				
				out.println("hello"+user.getEmail());
out.println("details"+user);
out.println(session.getId()+session.getCreationTime());

session.invalidate();
				
				

			}
	}

}
