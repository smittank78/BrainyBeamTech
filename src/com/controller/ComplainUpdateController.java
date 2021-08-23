package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.complainBean;
import com.dao.complainDao;

@WebServlet("/ComplainUpdateController")
public class ComplainUpdateController extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String date = request.getParameter("date");
		String title = request.getParameter("title");
		String detail = request.getParameter("detail");
		String mnum = request.getParameter("mNumber");
		String add = request.getParameter("adress");
		int Id = Integer.parseInt("id");
		
		complainBean bean = new complainBean();
		bean.setAddress(add);
		bean.setDate(date);
		bean.setDetails(detail);
		bean.setId(Id);
		bean.setMobileNumber(mnum);
		bean.setTitle(title);
		
		if(new complainDao().updateComplain(Id))
		{
			response.sendRedirect("showComplainController");
		}
		else
		{
			response.sendRedirect("showComplainController");
		}
	}

}
