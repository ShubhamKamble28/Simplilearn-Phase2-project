package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.model.Loginbeen;

public class LogonCon
{
	public static boolean verifyUser(Loginbeen l)
	{
		boolean status=true;
		
		try 
		{
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection
					("jdbc:mysql://localhost:3307/mydb?autoReconnect=true&useSSL=false", "root", "root");
			//System.out.println("Connection established");
			PreparedStatement ps = con.prepareStatement
					("select * from user where uname=? and password=?");
			ps.setString(1, l.getUname());
			ps.setString(2, l.getPassword());
			ResultSet rs = ps.executeQuery();
			status=rs.next();
			//System.out.println("data fetched");
					
		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			System.out.println(e);
		}
		
		return status;
	}

}
