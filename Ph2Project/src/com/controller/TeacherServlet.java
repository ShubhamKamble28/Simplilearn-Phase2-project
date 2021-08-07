package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.connection.AddTeacherDao;
import com.model.AddTeacher;



/**
 * Servlet implementation class TeacherServlet
 */
public class TeacherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TeacherServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		String title = request.getParameter("title");
		String tname = request.getParameter("tname");
		String email = request.getParameter("email");
		String phoneno = request.getParameter("phoneno");
		String tsubject = request.getParameter("subject");
		String qualificataion = request.getParameter("qualification");
		String gender = request.getParameter("gender");
		
		
		AddTeacher at = new AddTeacher();
		
		at.setTitle(title);
		at.setTname(tname);
		at.setEmail(email);
		at.setPhoneno(phoneno);
		at.setTsubject(tsubject);
		at.setQualificataion(qualificataion);
		at.setGender(gender);
		
		int ins=AddTeacherDao.addteacher(at);
		
		if(ins>0)
		{
			out.println("Teacher Added successfully...</br>");
			RequestDispatcher rd= request.getRequestDispatcher("TeacherList.jsp");
			rd.include(request, response);
			
		}
		else
		{
			out.println("Try again...");
			RequestDispatcher rd = request.getRequestDispatcher("AddTeacher.jsp");
			rd.include(request, response);
		}
	
	}
		

}
