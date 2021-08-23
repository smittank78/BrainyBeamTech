package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FeedBackConnection 
{
	private static String url = "jdbc:postgresql://localhost:5432/feedback";
	private static String userName = "postgres";
	private static String pass = "root";
	public static String driverClass = "org.postgresql.Driver";
	

	public static Connection getConnection()
	{	
		Connection con = null;
		try
		{
			Class.forName(driverClass);
			con = DriverManager.getConnection(url, userName, pass);
			if(con != null)
			{
				System.out.println("Connection Established");
			}
			else
			{
				System.out.println("Connection failed");
			}
		}
		catch (ClassNotFoundException e) 
		{
			System.out.println("ClassNotFound : try/catch at connection");
		}
		catch (SQLException e)
		{
			System.out.println("SQL Exception Occured at FeedBack Connection class");
		}
		return con;
	}
	public static void main(String[] args)
	{
		FeedBackConnection.getConnection();
	}
}
