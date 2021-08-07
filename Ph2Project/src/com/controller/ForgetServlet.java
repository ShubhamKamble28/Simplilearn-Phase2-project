package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.connection.ForgotCon;
import com.model.Loginbeen;

/**
 * Servlet implementation class ForgetServlet
 */
public class ForgetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ForgetServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		String uname = request.getParameter("uname");
		String password = request.getParameter("password1");
		
		Loginbeen l = new Loginbeen();
		l.setUname(uname);
		l.setPassword(password);
		int i = ForgotCon.changepsw(l);
		
		if(i>0)
		{
			response.sendRedirect("UpdatePsw.jsp");
			
		}
		else
		{
			out.println("error");
			response.sendRedirect("Login.jsp");
		}
		
	}

}
