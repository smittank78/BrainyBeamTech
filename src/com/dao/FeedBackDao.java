package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bean.FeedBackBean;
import com.util.FeedBackConnection;

public class FeedBackDao 
{
	Connection con;
	PreparedStatement pstmt;
	public boolean addFeedBack(FeedBackBean bean)
	{
		boolean flag=false;
		con = FeedBackConnection.getConnection();
		String query = "insert into feedback(date,title,des,experience,suggestion)values(?,?,?,?,?)";
		try
		{
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, bean.getDate());
			pstmt.setString(2, bean.getTitle());
			pstmt.setString(3, bean.getDes());
			pstmt.setString(4, bean.getEx());
			pstmt.setString(5, bean.getSug());
			int result = pstmt.executeUpdate();
			if(result > 0)
			{
				flag = true;
			}
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
			System.out.println("FeedBack Dao ----> SQL Exception (line37)");
		}
		
		
		return flag;
	}
}
