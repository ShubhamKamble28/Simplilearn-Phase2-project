package com.connection;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.model.RegisterBean;

public class RegistrationDao {

	public static int addStudent(RegisterBean rb)
	{
		int ins=0;
		
		try 
		{
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/ph2project?autoReconnect=true&useSSL=false", "root", "root");
			PreparedStatement ps = con.prepareStatement("insert into student (name,email,phoneno,address,dob,standard,gender) values(?,?,?,?,?,?,?)");
			
	
			ps.setString(1,rb.getName());
			ps.setString(2, rb.getEmail());
			ps.setString(3, rb.getPhone());
			ps.setString(4, rb.getAdd());
			ps.setString(5, rb.getDob());
			ps.setString(6, rb.getStd());
			ps.setString(7, rb.getGender());
			
			ins =ps.executeUpdate();
			
			
			
			
		}
		catch (Exception e) 
		{
			
			System.out.println(e);
		}
		return ins;
	}

}
