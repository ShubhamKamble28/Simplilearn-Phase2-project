package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.RegisterBean;

public class Studentlist
{
	
	public static List<RegisterBean> search(String std)
	{
		List<RegisterBean> l= new ArrayList();
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/ph2project?autoReconnect=true&useSSL=false", "root", "root");
			
			
			String query = "select * from student";
			PreparedStatement ps = null;
			if(!"ALL".equalsIgnoreCase(std) && null != std) {
				query += " where standard=?";
				ps = con.prepareStatement(query);
				ps.setString(1,std);
			}else {
				ps = con.prepareStatement(query);
			}
			
			ResultSet rs= ps.executeQuery();
			while(rs.next())
			{
				RegisterBean rb= new RegisterBean();
				rb.setName(rs.getString("name"));
				rb.setAdd(rs.getString("address"));
				rb.setEmail(rs.getString("email"));
				rb.setPhone(rs.getString("phoneno"));
				rb.setDob(rs.getString("dob"));
				rb.setStd(rs.getString("standard"));
				l.add(rb);
			}
		} 
		catch (Exception e)
		{
			System.out.println(e);
		}
		return l;
	}

}
