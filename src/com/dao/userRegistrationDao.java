package com.dao;
import com.bean.UserRegistrationBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.util.DBConnection;

public class userRegistrationDao 
{
	Connection con;
	PreparedStatement ptsmt;
	@SuppressWarnings("static-access")
	public boolean userRegistration(UserRegistrationBean bean)
	{
		boolean flag = false;
		con = DBConnection.getConnection();
		if(con != null)
		{
			System.out.println("connection get in dao file....");
			try 
			{
				String Query = "insert into unknown(fname,mname,lname,sage,sbdate,sclg,sclgstate,sclgcity,sclgpin,sgraduation,sdepartment,semail,spass,sphnum)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
				ptsmt = con.prepareStatement(Query);
//				fname | mname | lname | sage | sbdate | sclg | sclgstate | sclgcity | sclgpin | sgraduation | sdepartment | semail | spass | sphnum
				System.out.println("28 complete");
				ptsmt.setString(1,bean.FirstName);
				ptsmt.setString(2,bean.MidelName);
				ptsmt.setString(3,bean.LastName);
				ptsmt.setInt(4,bean.sAge);
				ptsmt.setString(5,bean.sBirthDate);
				ptsmt.setString(6,bean.sClg);
				ptsmt.setString(7,bean.sClgState);
				ptsmt.setString(8,bean.sClgCity);
				ptsmt.setInt(9,bean.sClgPin);
				ptsmt.setString(10,bean.sGraduation);
				ptsmt.setString(11,bean.sDepartment);
				ptsmt.setString(12,bean.sEmail);
				ptsmt.setString(13,bean.sPassword);
				ptsmt.setInt(14,bean.sPhNum);
				System.out.println("43 complete");
				int result = ptsmt.executeUpdate();
				System.out.println("45 complete");
				if(result > 0)
				{
					flag = true;
				}
			} 
			catch (SQLException e) 
			{
				System.out.println("sql exception....   :    dao46");
			}
		}
		return flag;
	}	
}
//fName varchar(10),mName varchar(10),lName varchar(10),sAge int,sBdate varchar(12),sClg varchar(20),sClgState varchar(10),sClgCity varchar(10),sClgPin int,sGraduation varchar(10),sDepartment varchar(4),sEmail varchar(20),sPass varchar(8),sPhNum int);
