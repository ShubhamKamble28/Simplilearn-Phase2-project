package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.model.AddTeacher;


public class TeacherList 
{
	public static List<AddTeacher> search(String subject)
	{
		List<AddTeacher> l= new ArrayList();
		System.out.println("subject : "+subject);
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/ph2project?autoReconnect=true&useSSL=false", "root", "root");
			
			String query = "select * from teacher ";
			PreparedStatement ps = null;
			if(!"ALL".equalsIgnoreCase(subject) && null != subject) {
				query += " where subject=?";
				ps = con.prepareStatement(query);
				ps.setString(1,subject);
			}else {
				ps = con.prepareStatement(query);
			}
			ResultSet rs= ps.executeQuery();
			while(rs.next())
			{
				AddTeacher at= new AddTeacher();
				at.setTitle(rs.getString("title"));
				at.setTname(rs.getString("tname"));
				at.setEmail(rs.getString("email"));
				at.setPhoneno(rs.getString("phone"));
				at.setTsubject(rs.getString("subject"));
				at.setQualificataion(rs.getString("qualification"));
				l.add(at);
			}
			
			
		} 
		catch (Exception e)
		{
			e.printStackTrace();
			System.out.println(e);
		}
		
		
		return l;   
	}
	
	
	
	
	
	public static List<AddTeacher> sub(String subject)
	{
		List<AddTeacher> l= new ArrayList();
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/ph2project?autoReconnect=true&useSSL=false", "root", "root");
			
			String query = "select title,tname,subject from teacher ";
			PreparedStatement ps = null;
			ps = con.prepareStatement(query);
			ResultSet rs= ps.executeQuery();
			while(rs.next())
			{
				AddTeacher at= new AddTeacher();
				at.setTitle(rs.getString("title"));
				at.setTname(rs.getString("tname"));
				at.setTsubject(rs.getString("subject"));
				l.add(at);
			}
			
			
		} 
		catch (Exception e)
		{
			e.printStackTrace();
			System.out.println(e);
		}
		return l;   
	}
	
	
	
	
	

}
