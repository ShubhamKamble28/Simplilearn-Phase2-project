package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.connection.LogonCon;
import com.model.Loginbeen;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		String uname = request.getParameter("uname");
		String psw = request.getParameter("password");
		
		Loginbeen lb = new Loginbeen();
		lb.setUname(uname);
		lb.setPassword(psw);
		
		boolean s = LogonCon.verifyUser(lb);
		
    	
    	if(s)
    	{
    		
    		HttpSession session = request.getSession();
    		session.setAttribute("uname", uname);
    		RequestDispatcher rd = request.getRequestDispatcher("Welcome.jsp");
    		rd.forward(request, response);
    	
    	}
    	else
    	{
    		out.println("Username or password error<br> please try again");
    		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
    		rd.include(request, response);
    	}
	}

}
