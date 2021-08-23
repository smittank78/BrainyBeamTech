package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.bean.loginBean;
import com.util.DBConnection;
import com.util.loginConnection;

public class loginDao 
{
	Connection con;
	PreparedStatement pstmt;
	
	public boolean login(loginBean bean)
	{
		boolean flag = false;
		con = loginConnection.getConnection();
		if(con != null)
		{
			String query = "insert into login(name,pass)values(?,?)";
			
			try
			{
				pstmt = con.prepareStatement(query);
				pstmt.setString(1,bean.getEmail());
				pstmt.setString(2, bean.getPass());
				
				int result = pstmt.executeUpdate();
				if(result > 0)
					flag = true;
			}
			catch (SQLException e) 
			{
				System.out.println("SQL Exception  :  Dao 35");
			}
		}
		return flag;
	}
	public static void main(String[]  args)
	{
		DBConnection.getConnection();
	}
}
