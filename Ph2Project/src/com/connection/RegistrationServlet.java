package com.connection;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.RegisterBean;

/**
 * Servlet implementation class RegistrationServlet
 */
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		//String id=request.getParameter("id");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String add = request.getParameter("add");
		String dob = request.getParameter("dob");
		String std = request.getParameter("std");
		String gender = request.getParameter("gender");
		
		
		
		//model creation
		
		RegisterBean rb = new RegisterBean();
		
		rb.setName(name);
		rb.setEmail(email);
		rb.setPhone(phone);
		rb.setAdd(add);
		rb.setDob(dob);
		rb.setStd(std);
		rb.setGender(gender);
		
		
		int in=RegistrationDao.addStudent(rb);
		
		if(in>0)
		{
			out.println("<b>Student Registered...<b></br>");
			RequestDispatcher rd= request.getRequestDispatcher("StudentList.jsp");
			rd.include(request, response);
			
		}
		else
		{
			out.println("Try again...");
			RequestDispatcher rd = request.getRequestDispatcher("StudentRegi.jsp");
			rd.include(request, response);
		}
	
	}
		
	

}
