package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.model.AddTeacher;

public class AddTeacherDao 
{
	public static int addteacher(AddTeacher at)
	{
		int ins=0;
		
		try 
		{
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/ph2project?autoReconnect=true&useSSL=false", "root", "root");
			PreparedStatement ps = con.prepareStatement("insert into teacher (title,tname,email,phone,subject,qualification,gender) values (?,?,?,?,?,?,?)");
			
			ps.setString(1, at.getTitle());
			ps.setString(2, at.getTname());
			ps.setString(3, at.getEmail());
			ps.setString(4, at.getPhoneno());
			ps.setString(5, at.getTsubject());
			ps.setString(6, at.getQualificataion());
			ps.setString(7, at.getGender());
			
			ins =ps.executeUpdate();	
			
		}
		catch (Exception e) 
		{
			
			System.out.println(e);
		}
		return ins;
	}

}
