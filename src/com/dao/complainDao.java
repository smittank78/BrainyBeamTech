package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bean.complainBean;
import com.util.complainConnection;

public class complainDao 
{
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;
	public boolean addComplain(complainBean bean)
	{
		boolean flag=false;
		String query = "insert into complain(date,title,detail,mnum,add)values(?,?,?,?,?)";
		con = complainConnection.getConnection();
		if(con != null)
		{
		try {
		pstmt= con.prepareStatement(query);
		pstmt.setString(1,bean.getDate());
		pstmt.setString(2,bean.getTitle());
		pstmt.setString(3,bean.getDetails());
		pstmt.setString(4,bean.getMobileNumber());
		pstmt.setString(5,bean.getAddress());
		int result = pstmt.executeUpdate();
		
		if(result > 0)
		{
			flag = true;
		}
		}
		catch (SQLException e)
		{
			e.getStackTrace();
			System.out.println("sql Exception : complainDao 42");
		}
		catch (Exception e) 
		{
			e.getStackTrace();
			System.out.println("exception : complainDao 47");
		}
		}
		return flag;
	}
	public List<complainBean> showComplain()
	{
		
		List<complainBean> listofComplain = new ArrayList<complainBean>();
		con = complainConnection.getConnection();
		if(con != null)
		{
			String query = "select * from complain";
			//complainDao.getcomplain();
			try 
			{
				pstmt = con.prepareStatement(query);
				rs = pstmt.executeQuery();
				System.out.println("dao : ");
				while(rs.next())
				{
					complainBean bean = new complainBean();
					bean.setId(rs.getInt("id"));
					bean.setDate(rs.getString("date"));
					bean.setTitle(rs.getString("title"));
					bean.setDetails(rs.getString("detail"));
					bean.setMobileNumber(rs.getString("mnum"));
					bean.setAddress(rs.getString("add"));
					listofComplain.add(bean);
					System.out.println(bean.getId() + " | " + bean.getDate() +" | " + bean.getTitle() +" | " +  bean.getDetails() +" | " +  bean.getMobileNumber() +" | ");
				}
			}
			catch (SQLException e) 
			{
				e.printStackTrace();
				System.out.println("sql exception");
			}
		}
		return listofComplain;
	}
	
	public boolean deleteComplain(int id)
	{
		boolean flag = false;
		con = complainConnection.getConnection();
		if(con != null)
		{
			String Query = "delete from complain where id=?";
			try 
			{
				pstmt = con.prepareStatement(Query);
				pstmt.setInt(1, id);
				int result = pstmt.executeUpdate();
				if(result>0)
				{
					flag = true;
				}
			} 
			catch (SQLException e)
			{
				e.printStackTrace();
				System.out.println("sql exception in delete dao : line 110");
			}
		}
		return flag;
	}
	
	public complainBean editComplain(int Id)
	{
		con = complainConnection.getConnection();
		String Query = "select * from complain where id=?";
		complainBean bean = new complainBean();
		try 
		{
			pstmt = con.prepareStatement(Query);
			pstmt.setInt(1, Id);
			rs = pstmt.executeQuery();
			while(rs.next())
			{
				
				bean.setDate(rs.getString("date"));
				bean.setAddress(rs.getString("add"));
				bean.setTitle(rs.getString("title"));
				bean.setMobileNumber(rs.getString("mnum"));
				bean.setDetails(rs.getString("detail"));
				bean.setId(rs.getInt("id"));
			}
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return bean;
	}
	
	public boolean updateComplain(int id)
	{
		boolean flag = false;
		con = complainConnection.getConnection();
		String updateQuery = "update complain set date=?,detail=?,mnum=?,add=?,title=? where id=?";
		complainBean bean = new complainBean();
		if(con != null)
		{
			try
			{
				pstmt = con.prepareStatement(updateQuery);
				pstmt.setString(1, bean.getDate());
				pstmt.setString(2, bean.getDetails());
				pstmt.setString(3, bean.getMobileNumber());
				pstmt.setString(4, bean.getAddress());
				pstmt.setString(5, bean.getTitle());
				pstmt.setInt(6, bean.getId());
				
				int result = pstmt.executeUpdate();
				if(result>0)
					flag=true;
			}
			catch(Exception e)
			{
				e.getStackTrace();
			}
		}
		return flag;
	}
}