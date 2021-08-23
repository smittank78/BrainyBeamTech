package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.complainBean;
import com.dao.complainDao;
import com.validation.validation;

@WebServlet("/complainController")
public class complainController extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String title = request.getParameter("title");
		String details = request.getParameter("detail");
		String address = request.getParameter("adress");
		String mobileNumber = request.getParameter("mNumber");
		String date = request.getParameter("date");
		PrintWriter out = response.getWriter();
		System.out.println(title + "  " + details + "  " + address + "  " + mobileNumber + "  " + date);

		complainBean bean = new complainBean();
		bean.setAddress(address);
		bean.setDate(date);
		bean.setDetails(details);
		bean.setMobileNumber(mobileNumber);
		bean.setTitle(title);
		

		if(title == null || title == "" || title.trim().length() <= 0 || details == null || details == "" || details.trim().length() <= 0 || address == null || address == "" || address.trim().length() <= 0|| mobileNumber == null || mobileNumber == "" || mobileNumber.trim().length() <= 0 || date == null || date == "" || date.trim().length() <= 0)	 
		{		
			out.println("<html><body><h1>invalid activity at complain</h1></body></html>");
			request.getRequestDispatcher("logout.jsp").forward(request, response);
		}
		else
		{
			System.out.println(title + "  " + details + "  " + address + "  " + mobileNumber + "  " + date);
			if(new complainDao().addComplain(bean))
			{
				System.out.println("data inserted");
				request.getRequestDispatcher("home.jsp").forward(request, response);
			}
			else
			{
				System.out.println("data not inserted");
				out.println("data not inserted");
				request.getRequestDispatcher("complain.jsp").include(request, response);
			}
		}
	}
}
