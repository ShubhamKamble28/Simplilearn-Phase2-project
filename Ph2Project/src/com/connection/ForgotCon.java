package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.model.Loginbeen;

public class ForgotCon 
{
	public static int changepsw(Loginbeen l)
	{
		int status=0;
		
		try 
		{
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection
					("jdbc:mysql://localhost:3307/mydb", "root", "root");
			System.out.println("Connection established");
			PreparedStatement ps = con.prepareStatement
					("update user set password=? where uname =?");
			ps.setString(2, l.getUname());
			ps.setString(1, l.getPassword());
			status = ps.executeUpdate();
					
		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			System.out.println(e);
		}
		
		return status;
	}

}
